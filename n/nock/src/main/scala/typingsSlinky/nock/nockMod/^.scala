package typingsSlinky.nock.nockMod

import typingsSlinky.node.NodeJS.EventEmitter
import typingsSlinky.node.urlMod.Url
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var back: Back = js.native
  var emitter: EventEmitter = js.native
  var recorder: Recorder = js.native
  def apply(basePath: String): Scope = js.native
  def apply(basePath: String, options: Options): Scope = js.native
  def apply(basePath: Url): Scope = js.native
  def apply(basePath: Url, options: Options): Scope = js.native
  def apply(basePath: RegExp): Scope = js.native
  def apply(basePath: RegExp, options: Options): Scope = js.native
}

