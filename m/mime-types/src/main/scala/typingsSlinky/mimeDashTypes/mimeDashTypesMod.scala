package typingsSlinky.mimeDashTypes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mimeDashTypes.mimeDashTypesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mime-types", JSImport.Namespace)
@js.native
object mimeDashTypesMod extends js.Object {
  def charset(typeString: String): String | `false` = js.native
  def contentType(filenameOrExt: String): String | `false` = js.native
  def extension(typeString: String): String | `false` = js.native
  def lookup(filenameOrExt: String): String | `false` = js.native
  @js.native
  object extensions
    extends /* key */ StringDictionary[js.Array[String]]
  
  @js.native
  object types extends /* key */ StringDictionary[String]
  
}

