require 'ruboto/widget'
require 'ruboto/util/toast'

ruboto_import_widgets :Button, :LinearLayout, :TextView

java_import 'android.util.Log'

# http://xkcd.com/378/

class SampleActivity
  def onCreate(bundle)
    super
    set_title 'Domo arigato, Mr Ruboto!'

    self.content_view =
        linear_layout :orientation => :vertical do
          @text_view = text_view :text => 'What hath Matz wrought?', :id => 42, :width => :match_parent,
                                 :gravity => :center, :text_size => 48.0
          button :text => 'M-x butterfly', :width => :match_parent, :id => 43, :on_click_listener => proc { butterfly }
          launcher = button :text => 'Post', :id => 44
          launcher.setOnClickListener do |view|
            toast 'launching!'
            # この書き方はオーバーロードの問題でエラーとなる。
            # intent = Java::android.content.Intent.new self.application_context, Java::com.example.hilohiro.sample.ruboto1.PostActivity
            intent = Java::android.content.Intent.new
#            intent.setClassName 'com.example.hilohiro.sample.ruboto1', 'com.example.hilohiro.sample.ruboto1.PostActivity'
            intent.setClass self.application_context, Java::com.example.hilohiro.sample.ruboto1.PostActivity
            startActivity intent
          end
        end
  rescue
    puts "Exception creating activity: #{$!}"
    puts $!.backtrace.join("\n")
  end

  private

  def butterfly
    @text_view.text = 'What hath Matz wrought!'
    toast 'Flipped a bit via butterfly'
  end

end
