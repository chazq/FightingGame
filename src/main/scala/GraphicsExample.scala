import javax.swing.JFrame

/**
  * Created by charlie on 30/11/17.
  */
trait GraphicsExample {

  val m: MyPanel = new MyPanel
  var done = false

  def GUIInitialiser(){
    val jframe: JFrame = new JFrame()
    jframe.setUndecorated(true)
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    jframe.setSize(1000,1000)
    jframe.add(m)
    jframe.pack()
    jframe.setVisible(true)

    while(!done){
      m.revalidate()
      m.repaint()
    }
  }
}
