# Kingdom
2015年に作成したjavaのGUIアプリケーション

### アプリケーション概要
今回はシミュレーション系 RPG のアプリケーションを作成した。  
ユーザーは王様側の視点に立ち国民を選定し出撃させ、魔王の軍隊を倒しながら魔王の討伐を目指す。  
今回作成したアプリケーションの独創的な点は、王様側の視点に立ちプレイヤー自身は国民たちを操作できず、最初に与えた装備と帰還命令、進撃命令のみで操作を行うということである。  
本来の RPG ではプレイヤーは勇者側の視点に立ち自らの力で魔王を討伐するものであり、王様は初期の協力者であるだけだった。  
今回はそこに目をつけて、冒険において役に立たない王様がどのように過ごしているのか、勇者たちとどのような関係にあるのかを王様側視点から描いた RPG となっている。  
今アプリケーションの意義は、普段の RPG では役に立たない王様がどのように過ごし、勇者たちの成果をヤキモキしながら待っているのか、そちら側の視点を使用ユーザーに考えていただく機会を作り出すことである。  

### アプリケーションの仕様
今回作成したアプリケーションのうち特徴的な機能を持つのは以下2つである。  
それぞれに関して説明していく。  
1. Main.java  
今回作成したプログラムの最も根幹となる部分である。  
作成した他のクラスをこの Main クラスで宣言し、扱っていく。  
まずコンストラクタで MainFrame の名前、CloseOperation、サイズ、可視化を宣言する。  
そこに CardLayout を適応した MainPanel を載せ、MainPanel 上に他のクラスで作成されたパネルを載せていく。  
設置された様々なボタンたちが押された時にその載せられたパネル達を CardLayout で切り替え、次の パネルへ移動する。  
一番初め、何の知識もなかった時はパネルが切り替えられる度にリムーブとアドを繰り返 しパネルの切り替えを行っていたが、JavaDrive の CardLayout クラスよりスマートにパネルの切り替えを行うことが出来るようになった。  
そして最後に SunMoon.java の無限ループする animation メソッドを実行する。  
2. SunMoon.java  
SunMoon クラスは国民が戦闘している間の王様と時間の流れをアニメーションで表現するクラスである。  
一番初めはボタンを押した際に repaint を用いた animation メソッドが起動する様なプログラムを作成していたがどうしても repaint が行われない。  
様々なサイトを検索し、以下の一文を発見した。  
この問題を解決するためには Runnable を用いたプログラムを製作する必要があるそうだが、何度か試してみても上手く動いてくれず、Swing である JButton から animation メソッドを呼び出すのは諦め、前述した通り Main.java で予め SunMoon の animation メソッドを動かしておくことにした。こうすることで、JButton が 行う挙動は CardLayout の切り替えだけであり、その切り替えによってあたかもアニメーションが動き出した かのように見せることに成功した。
ただし、このやり方では無限ループである animation メソッドをぬけ出すことが出来ず、そのメソッドの後に 他のメソッドを実行することや、他のアニメーションを追加することが出来ないためその場しのぎの実装とな ってしまった。

### アプリケーションの動作方法
#### 実行方法  
以下の 8 つの java ファイルを Eclipse に取り込んだ状態にする。  
Main.java、Opening.java、Battle.java、Select.java、Go.java、SunMoon.java、Report.java、Ending.java  
その状態の後、Main.java を実行する。  

#### 実行後の操作  
最初に Opening のパネルが表示される。  
本編へのボタンをクリックし次のパネルへと切り替えると Select パネルが表示される。  

#### Select パネルでの操作  
右側に並んだ 10 個のボタンの中から好きなボタンを 4 つ押す。  
すると左側に選択された国民の名前と強さが 4 人分表示される。  
その 4 人が気に入らなければ「リセットボタン」を押してボタンを最初の状態に戻す。  
その 4 人が気に入ったならば「決定」ボタンを押し、次の Go パネルに切り替わる。

#### Go パネルでの操作  
まず先ほど選択した 4 人の国民の名前と強さが上段 2 行 2 列で表示される。
4 人の中からまず一人を選んでボタンを押すと、そのプレイヤーの装備を選択する画面が表示される。  
右側に並んだ装備の中から好きな装備を一つ選んでプレイヤーに装備させる。  
すると左側に名前、装備名、強さが表示されるのでその装備で満足したならば「決定」ボタンを押してひとつ 前の画面に戻る。  
もし満足できなければ他の装備ボタンを押して好きな装備に切り替える。  
以上の行程を他の 3 人にも適応し、全員が装備を得た状態を作り出す。  
その状態に満足できなければ左下の「装備を外す」ボタンを選択し、もう一度やり直す。  
満足できたならば右下の「出発させる」ボタンを押し次の Sun Moon パネルに切り替える。  

#### Sun Moon パネルでの操作  
このパネルではユーザーが操作することは何もなく、太陽と月がぐるぐる周り、王様が右に左に移動する状況 を見ているだけである。
今回は王様が 2 周したら終わりになるよう設定していて、次の Report パネルに切り替わる。  
※もっと早くアニメーションを終わらせたい場合は SunMoon.java における animation メソッドの Thread.sleep の設定時間を短くする。

#### Report パネルでの操作 まず画面に戦闘結果と「より詳しい経過報告へ」と表記されたボタンが出現するのでボタンを押す。  
すると画面左上には王様への報告書、画面右上には勝利回数、敗北回数、経験値、ドロップの有無が表示される。  
その状況を確認して左下の「帰還させる」ボタンを押すか、右下のボタンを選択する。  
「帰還させる」ボタンが押された場合は、Go パネルの画面まで戻り装備を再選択することが出来る。  
右下のボタンは戦闘状況によって変化する。  
無事に敵に勝てた場合は「引き続き進む」ボタンが表示され、押すと Sun Moon パネルに戻る。  
ただし戦う相手は次の敵へと切り替わる。  
敵に負けてしまった場合は「もう一度挑戦する」ボタンが表示され、押すと Sun Moon パネルに戻る。  
ただし戦う相手は今さっき戦った相手のままである。  
敵に惨敗してしまった場合は「国民を選定する」ボタンが表示され、押すと Select パネルに戻る。  
その場合は装備アイテムだけを残して他の情報は全てリセットされる。  
以上の動作を繰り返し、無事に魔王城で魔王を討伐することができたら右下のボタンが 「国に帰還する」ボタンに切り替わる。  
これを押すと Ending パネルに切り替わり画面上に選択した国民とその強さ、装備が表示される。  
右上の「Go Back Opening」を押すと Opening パネルに切り替わり最初に戻ることができる。  
最初に戻ったあとは先ほどと同じように行程を踏みおまけの敵を倒すことが出来る。

### 結論と今後の課題
現段階において制作する予定だった概ねほとんどの機能を実装することが出来た。  
だが、時間的余裕がなかったためにレイアウトにこだわることが出来ず、殆どが Grid Layout を用いた為に全体的に角々したアプリケーションになってしまった。  
またボタン等のグラフィックも特に設定せずデフォルト の描写になってしまった。
他にも Sun Moon パネルで王様がやることがなく右往左往する様子を表現したかったが、同じアニメーション が出撃する度に表示されるのは非常に煩わしいものであった。  
ここの月と太陽の移動速度をゲーム内において 変更できる機能を追加するべきである。
また Sun Moon パネルにおいては王様が右往左往するだけではなく、プレイヤーが王様を操作できるようにして、国政や、金策、新しい装備の作成、国民の強化などが行えるようにしたらゲームとして広がりができると思わる。  
あとは国民の職業、装備や場所、敵などの説明が画像付きでポップアップするようなグラフィカルな方向にも 発展させていきたいと考えている。  
また戦闘の計算が単純に力のみを比較するものだったので、ゲームとしてつまらなくなってしまった。  
HP や MP、防御力、スピード等を追加してゲームとしてより奥深いものに改善していきたいと思う。

### 参考文献
JavaDrive:CardLayout クラス (http://www.javadrive.jp/tutorial/cardlayout/)
WisdomSoft(旧):Swing 入門(http://wisdom.sakura.ne.jp/system/java/swing/index.html)
