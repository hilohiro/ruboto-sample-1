# Ruboto Sample 1
Ruboto実装サンプルその1

[西脇.rb & 東灘.rb 合同もくもく会 2nd](http://nishiwaki-higashinadarb.doorkeeper.jp/events/3270)向け予習


## やったこと
### ruboto gen app

    ruboto gen app --package com.example.hilohiro.sample.ruboto1 --path .\ruboto1 --name RubotoSample1 --target android-15 --activity SampleActivity

* `--name`に"Ruboto Sample 1"を渡したらエラー。
* `--name`に"ruboto-sample-1"を渡してもエラー。
* `--path`のディレクトリが存在しているとエラー。

### githubに登録

### Activity追加

    ruboto gen class Activity --name=PostActivity

### 非同期タスクの追加

    ruboto gen subclass android.os.AsyncTask --name=PostTask --method_base=all

* PostTaskでエラーが発生した。
    * AsyncTaskは<Params, Result, Progress>なのでここが対応できていない
    * PostTask.javaをがりがり編集して型のエラーを除去
        * でも doInBackground(String param, ...)のエラーを除けなかったのでString => Objectに逃げた
* post_task.rbでいろいろ失敗
    1. def doInBackground が呼び出されない
        * do_in_backgroundを実行しようとしていた
    1. def onPreExecute が呼び出されない
        * 何かエラーが起きてる
    1. toastが表示されない
        * AsyncTaskはComponentではないのでActivityのを利用する
        * でも表示されない(Activityからタスクの表示メソッドを直接呼び出したら動いていた)
