package typingsSlinky.dva

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.dva.dvaStrings.`@@routerSlashCALL_HISTORY_METHOD`
import typingsSlinky.dva.dvaStrings.`@@routerSlashLOCATION_CHANGE`
import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationDescriptor
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.Omit
import typingsSlinky.reactDashRouter.reactDashRouterMod.PromptProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RedirectProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticContext
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.SwitchProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.WithRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.WithRouterStatics
import typingsSlinky.reactDashRouter.reactDashRouterMod.`match`
import typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.BrowserRouterProps
import typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps
import typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.LinkProps
import typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.NavLinkProps
import typingsSlinky.reactDashRouterDashRedux.Anon_Router
import typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.ConnectedRouterProps
import typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.RouterAction
import typingsSlinky.reactDashRouterDashRedux.reactDashRouterDashReduxMod.RouterState
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Dispatch
import typingsSlinky.redux.reduxMod.Middleware
import typingsSlinky.redux.reduxMod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class BrowserRouter ()
    extends Component[BrowserRouterProps, js.Any, js.Any]
  
  @js.native
  class HashRouter ()
    extends Component[HashRouterProps, js.Any, js.Any]
  
  @js.native
  class Link[S] ()
    extends Component[LinkProps[S], js.Any, js.Any]
  
  @js.native
  class MemoryRouter ()
    extends Component[MemoryRouterProps, js.Any, js.Any]
  
  @js.native
  class NavLink[S] ()
    extends Component[NavLinkProps[S], js.Any, js.Any]
  
  @js.native
  class Prompt ()
    extends Component[PromptProps, js.Any, js.Any]
  
  @js.native
  class Redirect ()
    extends Component[RedirectProps, js.Any, js.Any]
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends Component[T, js.Any, js.Any]
  
  @js.native
  class Router ()
    extends Component[RouterProps, js.Any, js.Any]
  
  @js.native
  class StaticRouter ()
    extends Component[StaticRouterProps, js.Any, js.Any]
  
  @js.native
  class Switch ()
    extends Component[SwitchProps, js.Any, js.Any]
  
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  def useLocation[S](): Location[S] = js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useParams with js.Any */](): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ p in keyof Params ]: string}
    */ typingsSlinky.dva.dvaStrings.useParams with js.Any = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with js.Any */](): `match`[Params] = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with js.Any */](path: String): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with js.Any */](path: js.Array[String]): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with js.Any */](path: RouteProps): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[(Omit[P, String]) with WithRouterProps[C]]) with WithRouterStatics[C] = js.native
  @js.native
  object routerRedux extends js.Object {
    @js.native
    class ConnectedRouter[State] ()
      extends Component[ConnectedRouterProps[State], js.Object, js.Any]
    
    val CALL_HISTORY_METHOD: `@@routerSlashCALL_HISTORY_METHOD` = js.native
    val LOCATION_CHANGE: `@@routerSlashLOCATION_CHANGE` = js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
    def createMatchSelector(path: String): js.Function1[/* state */ Anon_Router, `match`[js.Object] | Null] = js.native
    def go(n: Double): RouterAction = js.native
    def goBack(): RouterAction = js.native
    def goForward(): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
    @js.native
    object routerActions extends js.Object {
      var go: js.Function1[/* n */ Double, RouterAction] = js.native
      var goBack: js.Function0[RouterAction] = js.native
      var goForward: js.Function0[RouterAction] = js.native
      var push: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      var replace: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
    }
    
  }
  
}

