package typingsSlinky.primereact

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("primereact/components/util", JSImport.Namespace)
@js.native
object componentsUtilMod extends js.Object {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}

