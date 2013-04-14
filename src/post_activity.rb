# -*- encoding: utf-8 -*-
require 'ruboto/widget'
require 'ruboto/util/toast'

ruboto_import_widgets :Button, :LinearLayout, :EditText, :TextView

java_import 'android.util.Log'
java_import 'android.text.InputType'
java_import 'android.view.inputmethod.EditorInfo'

# http://xkcd.com/378/

class PostActivity
  def onCreate(bundle)
    super
    set_title 'twitterに投稿'

    self.content_view =
        linear_layout :orientation => :vertical do
          text_view :text => 'URL', :id => 45, :width => :match_parent
          @url_edit = edit_text :id => 46, :width => :match_parent, :height => :wrap_content, :text => '',
                                :input_type => InputType.TYPE_CLASS_TEXT | InputType::TYPE_TEXT_VARIATION_URI
          text_view :text => 'メッセージ', :id => 47, :width => :match_parent
          @edit_view = edit_text :id => 44, :width => :match_parent, :height => :wrap_content, :text => '',
                                 :ime_options => EditorInfo::IME_ACTION_SEND
          button :text => '投稿', :width => :match_parent, :id => 43, :on_click_listener => proc { apply_to_label }
          @text_view = text_view :text => '', :id => 42, :width => :match_parent,
                                 :gravity => :center, :text_size => 48.0
        end
  rescue
    puts "Exception creating activity: #{$!}"
    puts $!.backtrace.join("\n")
  end

  private

  def apply_to_label
    @text_view.text = @edit_view.text
  end

end
