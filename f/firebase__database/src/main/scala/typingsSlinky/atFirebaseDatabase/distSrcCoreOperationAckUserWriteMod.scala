package typingsSlinky.atFirebaseDatabase

import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.Operation
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationSource
import typingsSlinky.atFirebaseDatabase.distSrcCoreOperationOperationMod.OperationType
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilImmutableTreeMod.ImmutableTree
import typingsSlinky.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/operation/AckUserWrite", JSImport.Namespace)
@js.native
object distSrcCoreOperationAckUserWriteMod extends js.Object {
  @js.native
  class AckUserWrite protected () extends Operation {
    /**
      *
      * @param {!Path} path
      * @param {!ImmutableTree<!boolean>} affectedTree A tree containing true for each affected path. Affected paths can't overlap.
      * @param {!boolean} revert
      */
    def this(
      /**@inheritDoc */ path: Path,
      /**@inheritDoc */ affectedTree: ImmutableTree[Boolean],
      /**@inheritDoc */ revert: Boolean
    ) = this()
    /**@inheritDoc */ var affectedTree: ImmutableTree[Boolean] = js.native
    /**
      * @type {!Path}
      */
    /* CompleteClass */
    override var path: Path = js.native
    /**@inheritDoc */ var revert: Boolean = js.native
    /**
      * @type {!OperationSource}
      */
    /* CompleteClass */
    override var source: OperationSource = js.native
    /**
      * @type {!OperationType}
      */
    /* CompleteClass */
    override var `type`: OperationType = js.native
    /**
      * @param {string} childName
      * @return {?Operation}
      */
    /* CompleteClass */
    override def operationForChild(childName: String): Operation | Null = js.native
  }
  
}

