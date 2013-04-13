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

