package tutorial
import org.scalajs.jquery.{jQuery => $}
import scalatags.JsDom.all._
import scala.scalajs.js.annotation.JSExportTopLevel

/**
  * @see https://codeholistic.com
  */
@JSExportTopLevel("Home")
object Home {
  private var counter = 1

  def initWebsite(): Unit = {
    val mainDiv = div(
      button(
        onclick := { () =>
          $(createHelloMessage(counter)).appendTo($("#mainContent"))
          counter += 1
        },
      )("Say Hello"),
      div(id := "mainContent")
    )
    $("body").append(mainDiv.render)
  }

  private def createHelloMessage(counter: Int) = {
    h3("Hello Scala.js User " + counter).render
  }

  /*main method is called automatically on loading the page **/
  def main(args: Array[String]): Unit = {
    initWebsite()
  }
}
