package typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import typingsSlinky.reactDashNavigation.Anon_ActionKey
import typingsSlinky.reactDashNavigation.Anon_ParamsP
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDispatch
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationEventCallback
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationEventSubscription
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationState
import typingsSlinky.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.refocus
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {openDrawer (): void, closeDrawer (): void, toggleDrawer (): void, jumpTo (routeName : string, key ? : string): void} */
@js.native
trait NavigationDrawerProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with Anon_ParamsP[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def closeDrawer(): Unit = js.native
  @JSName("closeDrawer")
  def closeDrawer_Any(): js.Any = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  def getParam[T /* <: String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: String */](
    param: T,
    fallback: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
  ] = js.native
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  def isFirstRouteInParent(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def jumpTo(routeName: String): Unit = js.native
  def jumpTo(routeName: String, key: String): Unit = js.native
  def navigate(options: Anon_ActionKey): Boolean = js.native
  def navigate(routeNameOrOptions: String): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams, action: NavigationAction): Boolean = js.native
  def openDrawer(): Unit = js.native
  @JSName("openDrawer")
  def openDrawer_Any(): js.Any = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
  def toggleDrawer(): Unit = js.native
  @JSName("toggleDrawer")
  def toggleDrawer_Any(): js.Any = js.native
}

