package typingsSlinky.semanticDashUiDashEmbed.SemanticUI.Embed.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String
  /**
    * @default 'No URL specified'
    */
  var noURL: String
}

object _Impl {
  @scala.inline
  def apply(method: String, noURL: String): _Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noURL = noURL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

