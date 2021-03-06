package typingsSlinky.atPulumiKubernetes.typesInputMod.storage.v1

import typingsSlinky.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeNodeResources is a set of resource limits for scheduling of volumes.
  */
trait VolumeNodeResources extends js.Object {
  /**
    * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A
    * volume that is both attached and mounted on a node is considered to be used once, not
    * twice. The same rule applies for a unique volume that is shared among multiple pods on the
    * same node. If this field is not specified, then the supported number of volumes on this
    * node is unbounded.
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
}

object VolumeNodeResources {
  @scala.inline
  def apply(count: Input[Double] = null): VolumeNodeResources = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeNodeResources]
  }
}

