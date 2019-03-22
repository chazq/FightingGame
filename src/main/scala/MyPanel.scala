import java.awt.{Color, Dimension, Graphics}
import javax.swing.{BorderFactory, JPanel}

/**
  * Created by charlie on 23/11/17.
  */
class MyPanel extends JPanel {

  override def paint(g: Graphics) {
    g.drawString("Hello Dave", 10, 10)
    }

  def MyPanel() {
    setBorder(BorderFactory.createLineBorder(Color.black))
  }

  override def getPreferredSize: Dimension = {
    new Dimension(500,400)
  }

  setFocusable(true)

}
