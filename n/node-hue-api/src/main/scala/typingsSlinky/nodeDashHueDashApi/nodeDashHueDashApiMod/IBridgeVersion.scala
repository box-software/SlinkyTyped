package typingsSlinky.nodeDashHueDashApi.nodeDashHueDashApiMod

import typingsSlinky.nodeDashHueDashApi.Anon_Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeVersion extends js.Object {
  var name: String
  var version: Anon_Api
}

object IBridgeVersion {
  @scala.inline
  def apply(name: String, version: Anon_Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBridgeVersion]
  }
}

