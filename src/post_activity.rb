# -*- encoding: utf-8 -*-
require 'ruboto/widget'
require 'ruboto/util/toast'

ruboto_import_widgets :Button, :LinearLayout, :EditText, :TextView

java_import 'android.util.Log'

# http://xkcd.com/378/

class PostActivity
  def onCreate(bundle)
    super
    set_title 'ここはタイトル'

    self.content_view =
        linear_layout :orientation => :vertical do
          @text_view = text_view :text => 'What hath Matz wrought?', :id => 42, :width => :match_parent,
                                 :gravity => :center, :text_size => 48.0
#          @edit_view = edit_text :id => 44, :width => :match_parent, :input_type => :text
          button :text => 'M-x butterfly', :width => :match_parent, :id => 43, :on_click_listener => proc { butterfly }
        end
  rescue
    puts "Exception creating activity: #{$!}"
    puts $!.backtrace.join("\n")
  end

  private

  def butterfly
#    toast @edit_view.text[0..10]
    toast 'Flipped a bit via butterfly'
  end

end
