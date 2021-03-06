package typingsSlinky.reactDashSizeme.reactDashSizemeMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashSizeme.reactDashSizemeStrings.size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sizeme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var noPlaceholders: Boolean = js.native
  def apply(): js.Function1[
    /* component */ ReactComponentClass[js.Object], 
    ReactComponentClass[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  def apply(options: SizeMeOptions): js.Function1[
    /* component */ ReactComponentClass[js.Object], 
    ReactComponentClass[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
}

