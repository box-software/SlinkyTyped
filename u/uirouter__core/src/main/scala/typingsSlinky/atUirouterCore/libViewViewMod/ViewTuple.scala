package typingsSlinky.atUirouterCore.libViewViewMod

import typingsSlinky.atUirouterCore.libViewInterfaceMod.ActiveUIView
import typingsSlinky.atUirouterCore.libViewInterfaceMod.ViewConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTuple extends js.Object {
  var uiView: ActiveUIView
  var viewConfig: ViewConfig
}

object ViewTuple {
  @scala.inline
  def apply(uiView: ActiveUIView, viewConfig: ViewConfig): ViewTuple = {
    val __obj = js.Dynamic.literal(uiView = uiView.asInstanceOf[js.Any], viewConfig = viewConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewTuple]
  }
}

