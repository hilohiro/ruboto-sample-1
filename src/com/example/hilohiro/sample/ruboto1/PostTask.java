// Generated Ruboto subclass with method base "all"

package com.example.hilohiro.sample.ruboto1;

import org.ruboto.JRubyAdapter;
import org.ruboto.Log;
import org.ruboto.Script;
import org.ruboto.ScriptInfo;
import org.ruboto.ScriptLoader;

public class PostTask extends android.os.AsyncTask<Object, Integer, Void> implements org.ruboto.RubotoComponent {
    private final ScriptInfo scriptInfo = new ScriptInfo();
    {
		scriptInfo.setRubyClassName(getClass().getSimpleName());
		ScriptLoader.loadScript(this);
    }

  public PostTask() {
    super();
    android.util.Log.d("PostTask.java", "PostTask()");
  }

    public ScriptInfo getScriptInfo() {
        return scriptInfo;
    }

  public Void doInBackground(final Object... params) {
    android.util.Log.d("PostTask.java", "doInBackground");
    if (ScriptLoader.isCalledFromJRuby()) return null;
    android.util.Log.d("PostTask.java", "1");
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#doInBackground");
      return null;
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    android.util.Log.d("PostTask.java", rubyClassName);
    if (rubyClassName == null) return null;
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :do_in_background}")) {
      android.util.Log.d("PostTask.java", "2");
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_params", params);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Void) JRubyAdapter.runScriptlet("$ruby_instance.do_in_background($arg_params)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Void) JRubyAdapter.runRubyMethod(Void.class, scriptInfo.getRubyInstance(), "do_in_background", params);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      android.util.Log.d("PostTask.java", "3");
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :doInBackground}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_params", params);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Void) JRubyAdapter.runScriptlet("$ruby_instance.doInBackground($arg_params)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Void) JRubyAdapter.runRubyMethod(Void.class, scriptInfo.getRubyInstance(), "doInBackground", params);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        android.util.Log.d("PostTask.java", "4");
        return null;
      }
    }
  }

  public void onCancelled() {
    if (ScriptLoader.isCalledFromJRuby()) {super.onCancelled(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#onCancelled");
      {super.onCancelled(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onCancelled(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_cancelled}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_cancelled()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_cancelled");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onCancelled}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onCancelled()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onCancelled");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onCancelled(); return;}
      }
    }
  }

  public void onPostExecute(Void result) {
    android.util.Log.d("PostTask.java", "onPostExecute()");
    if (ScriptLoader.isCalledFromJRuby()) {super.onPostExecute(result); return;}
    android.util.Log.d("PostTask.java", "1");
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#onPostExecute");
      {super.onPostExecute(result); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    android.util.Log.d("PostTask.java", rubyClassName);
    if (rubyClassName == null) {super.onPostExecute(result); return;}
    android.util.Log.d("PostTask.java", "2");
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_post_execute}")) {
      android.util.Log.d("PostTask.java", "3");
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_result", result);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_post_execute($arg_result)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_post_execute", result);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      android.util.Log.d("PostTask.java", "4");
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onPostExecute}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_result", result);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onPostExecute($arg_result)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onPostExecute", result);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        android.util.Log.d("PostTask.java", "5");
        {super.onPostExecute(result); return;}
      }
    }
  }

  public void onPreExecute() {
    android.util.Log.d("PostTask.java", "onPreExecute()");
    if (ScriptLoader.isCalledFromJRuby()) {super.onPreExecute(); return;}
    android.util.Log.d("PostTask.java", "1");
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#onPreExecute");
      {super.onPreExecute(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    android.util.Log.d("PostTask.java", rubyClassName);
    if (rubyClassName == null) {super.onPreExecute(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_pre_execute}")) {
        android.util.Log.d("PostTask.java", "2");
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_pre_execute()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_pre_execute");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onPreExecute}")) {
        android.util.Log.d("PostTask.java", "3");
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onPreExecute()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onPreExecute");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        android.util.Log.d("PostTask.java", "4");
        {super.onPreExecute(); return;}
      }
    }
  }

  public void onProgressUpdate(Integer... values) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onProgressUpdate(values); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#onProgressUpdate");
      {super.onProgressUpdate(values); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onProgressUpdate(values); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_progress_update}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_values", values);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_progress_update($arg_values)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_progress_update", values);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onProgressUpdate}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_values", values);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onProgressUpdate($arg_values)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onProgressUpdate", values);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onProgressUpdate(values); return;}
      }
    }
  }

  public void onCancelled(Void result) {
    if (ScriptLoader.isCalledFromJRuby()) {super.onCancelled(result); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#onCancelled");
      {super.onCancelled(result); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.onCancelled(result); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :on_cancelled}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_result", result);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.on_cancelled($arg_result)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "on_cancelled", result);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :onCancelled}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_result", result);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.onCancelled($arg_result)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "onCancelled", result);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.onCancelled(result); return;}
      }
    }
  }

  public java.lang.Object clone()  throws java.lang.CloneNotSupportedException{
    if (ScriptLoader.isCalledFromJRuby()) return super.clone();
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#clone");
      return super.clone();
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.clone();
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :clone}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (java.lang.Object) JRubyAdapter.runScriptlet("$ruby_instance.clone()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (java.lang.Object) JRubyAdapter.runRubyMethod(java.lang.Object.class, scriptInfo.getRubyInstance(), "clone");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :clone}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (java.lang.Object) JRubyAdapter.runScriptlet("$ruby_instance.clone()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (java.lang.Object) JRubyAdapter.runRubyMethod(java.lang.Object.class, scriptInfo.getRubyInstance(), "clone");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.clone();
      }
    }
  }

  public boolean equals(java.lang.Object o) {
    if (ScriptLoader.isCalledFromJRuby()) return super.equals(o);
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#equals");
      return super.equals(o);
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.equals(o);
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :equals}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$arg_o", o);
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.equals($arg_o)");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "equals", o);
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :equals}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$arg_o", o);
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Boolean) JRubyAdapter.runScriptlet("$ruby_instance.equals($arg_o)");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Boolean) JRubyAdapter.runRubyMethod(Boolean.class, scriptInfo.getRubyInstance(), "equals", o);
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.equals(o);
      }
    }
  }

  public void finalize()  throws java.lang.Throwable{
    if (ScriptLoader.isCalledFromJRuby()) {super.finalize(); return;}
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#finalize");
      {super.finalize(); return;}
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) {super.finalize(); return;}
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :finalize}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        JRubyAdapter.runScriptlet("$ruby_instance.finalize()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "finalize");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :finalize}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          JRubyAdapter.runScriptlet("$ruby_instance.finalize()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            JRubyAdapter.runRubyMethod(scriptInfo.getRubyInstance(), "finalize");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        {super.finalize(); return;}
      }
    }
  }

  public int hashCode() {
    if (ScriptLoader.isCalledFromJRuby()) return super.hashCode();
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#hashCode");
      return super.hashCode();
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.hashCode();
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :hash_code}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (Integer) ((Number)JRubyAdapter.runScriptlet("$ruby_instance.hash_code()")).intValue();
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (Integer) JRubyAdapter.runRubyMethod(Integer.class, scriptInfo.getRubyInstance(), "hash_code");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :hashCode}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (Integer) ((Number)JRubyAdapter.runScriptlet("$ruby_instance.hashCode()")).intValue();
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (Integer) JRubyAdapter.runRubyMethod(Integer.class, scriptInfo.getRubyInstance(), "hashCode");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.hashCode();
      }
    }
  }

  public java.lang.String toString() {
    if (ScriptLoader.isCalledFromJRuby()) return super.toString();
    if (!JRubyAdapter.isInitialized()) {
      Log.i("Method called before JRuby runtime was initialized: PostTask#toString");
      return super.toString();
    }
    String rubyClassName = scriptInfo.getRubyClassName();
    if (rubyClassName == null) return super.toString();
    if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :to_string}")) {
      // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
      if (JRubyAdapter.isJRubyPreOneSeven()) {
        JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
        return (java.lang.String) JRubyAdapter.runScriptlet("$ruby_instance.to_string()");
      } else {
        if (JRubyAdapter.isJRubyOneSeven()) {
          return (java.lang.String) JRubyAdapter.runRubyMethod(java.lang.String.class, scriptInfo.getRubyInstance(), "to_string");
        } else {
          throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
        }
      }
    } else {
      if ((Boolean)JRubyAdapter.runScriptlet(rubyClassName + ".instance_methods(false).any?{|m| m.to_sym == :toString}")) {
        // FIXME(uwe): Simplify when we stop support for RubotoCore 0.4.7
        if (JRubyAdapter.isJRubyPreOneSeven()) {
          JRubyAdapter.put("$ruby_instance", scriptInfo.getRubyInstance());
          return (java.lang.String) JRubyAdapter.runScriptlet("$ruby_instance.toString()");
        } else {
          if (JRubyAdapter.isJRubyOneSeven()) {
            return (java.lang.String) JRubyAdapter.runRubyMethod(java.lang.String.class, scriptInfo.getRubyInstance(), "toString");
          } else {
            throw new RuntimeException("Unknown JRuby version: " + JRubyAdapter.get("JRUBY_VERSION"));
          }
        }
      } else {
        return super.toString();
      }
    }
  }

}
