package typingsSlinky.sparkpost.sparkpostMod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T] extends IncomingMessage {
  var body: T = js.native
}

