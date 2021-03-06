package typingsSlinky.rx.rxMod

import typingsSlinky.rxDashCore.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "ReplaySubjectCls")
@js.native
class ReplaySubjectCls[T] ()
  extends typingsSlinky.rxDashCoreDashBinding.Rx.ReplaySubjectCls[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, window: Double) = this()
  def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
}

