package typingsSlinky.wxDashServerDashSdk

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudPath extends js.Object {
  var cloudPath: String
  var fileContent: Buffer | ReadStream
}

object Anon_CloudPath {
  @scala.inline
  def apply(cloudPath: String, fileContent: Buffer | ReadStream): Anon_CloudPath = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CloudPath]
  }
}

