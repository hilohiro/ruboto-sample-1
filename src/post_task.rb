# -*- encoding: utf-8 -*-
require 'java'
require 'ruboto/util/toast'

java_import 'android.util.Log'

class PostTask
  C = 'PostTask'

  attr_accessor :context

  def on_pre_execute
    Log.d(C, 'onPreExecute')
    toast 'onPreExecute'
  end

  def do_in_background(params)
    Log.d(C, 'doInBackground')
    java.lang.Thread.sleep(1000)
  end

  def on_post_execute(none)
    Log.d(C, 'onPostExecute')
    toast 'onPostExecute'
  end

  private

  def toast(text, duration=5000)
#    Java::android.widget.Toast.makeText(self, text, duration).show
    @context.toast(text, duration) unless @context.nil?
  end

end
