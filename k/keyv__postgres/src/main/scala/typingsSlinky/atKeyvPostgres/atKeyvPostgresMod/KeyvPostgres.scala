package typingsSlinky.atKeyvPostgres.atKeyvPostgresMod

import typingsSlinky.atKeyvPostgres.atKeyvPostgresBooleans.`false`
import typingsSlinky.keyv.keyvMod.Store
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvPostgres
  extends EventEmitter
     with Store[js.UndefOr[String]] {
  var namespace: js.UndefOr[String] = js.native
  val ttlSupport: `false` = js.native
  def set(key: String): js.Promise[_] = js.native
  def set(key: String, value: String): js.Promise[_] = js.native
}

