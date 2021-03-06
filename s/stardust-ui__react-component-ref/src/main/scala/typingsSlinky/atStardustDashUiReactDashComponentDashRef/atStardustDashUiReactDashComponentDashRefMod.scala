package typingsSlinky.atStardustDashUiReactDashComponentDashRef

import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.atStardustDashUiReactDashComponentDashRef.distEsRefFindNodeMod.default
import typingsSlinky.atStardustDashUiReactDashComponentDashRef.distEsTypesMod.RefProps
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@stardust-ui/react-component-ref", JSImport.Namespace)
@js.native
object atStardustDashUiReactDashComponentDashRefMod extends js.Object {
  @js.native
  class RefFindNode () extends default
  
  @js.native
  class RefForward ()
    extends typingsSlinky.atStardustDashUiReactDashComponentDashRef.distEsRefForwardMod.default
  
  val Ref: ReactComponentClass[RefProps] = js.native
  val refPropType: Requireable[typingsSlinky.react.reactMod.Ref[js.Any]] = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  def handleRef[N](ref: typingsSlinky.react.reactMod.Ref[N], node: N): Unit = js.native
  /** Checks that the passed object is a valid React ref object. */
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  /** Creates a React ref object from existing DOM node. */
  def toRefObject[T /* <: Node */](node: T): ReactRef[T] = js.native
  /* static members */
  @js.native
  object RefFindNode extends js.Object {
    var displayName: String = js.native
    var propTypes: Anon_Children | Anon_ChildrenInnerRef = js.native
  }
  
  /* static members */
  @js.native
  object RefForward extends js.Object {
    var displayName: String = js.native
    var propTypes: Anon_Children | Anon_ChildrenInnerRef = js.native
  }
  
}

