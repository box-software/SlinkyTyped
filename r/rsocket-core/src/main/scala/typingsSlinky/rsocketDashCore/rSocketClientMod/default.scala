package typingsSlinky.rsocketDashCore.rSocketClientMod

import typingsSlinky.rsocketDashFlowable.rsocketDashFlowableMod.Single
import typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketClient", JSImport.Default)
@js.native
class default[D, M] protected () extends RSocketClient[D, M] {
  def this(config: ClientConfig[D, M]) = this()
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def connect(): Single[ReactiveSocket[D, M]] = js.native
}

