package typingsSlinky.atMaterialDashUiCore.slideSlideMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.down
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.up
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashTransitionDashGroup.Anon_Appear
import typingsSlinky.reactDashTransitionDashGroup.transitionMod.EndHandler
import typingsSlinky.reactDashTransitionDashGroup.transitionMod.EnterHandler
import typingsSlinky.reactDashTransitionDashGroup.transitionMod.ExitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core/transitions/transition.TransitionProps */
@js.native
trait SlideProps extends js.Object {
  var addEndListener: js.UndefOr[EndHandler] = js.native
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.native
  var direction: left | right | up | down = js.native
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  var onEnter: js.UndefOr[EnterHandler] = js.native
  var onEntered: js.UndefOr[EnterHandler] = js.native
  var onEntering: js.UndefOr[EnterHandler] = js.native
  var onExit: js.UndefOr[ExitHandler] = js.native
  var onExited: js.UndefOr[ExitHandler] = js.native
  var onExiting: js.UndefOr[ExitHandler] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var timeout: js.UndefOr[Double | Anon_Appear] = js.native
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}

object SlideProps {
  @scala.inline
  def apply(
    direction: left | right | up | down,
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null,
    style: CSSProperties = null,
    theme: Theme = null,
    timeout: Double | Anon_Appear = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): SlideProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2(addEndListener))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideProps]
  }
}

