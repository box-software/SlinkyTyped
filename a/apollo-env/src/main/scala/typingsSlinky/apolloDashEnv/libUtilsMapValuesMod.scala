package typingsSlinky.apolloDashEnv

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/utils/mapValues", JSImport.Namespace)
@js.native
object libUtilsMapValuesMod extends js.Object {
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
}

