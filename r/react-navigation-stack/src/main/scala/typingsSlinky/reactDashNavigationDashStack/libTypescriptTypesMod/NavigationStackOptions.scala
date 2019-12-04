package typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod

import slinky.core.TagMod
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigationDashStack.Anon_Horizontal
import typingsSlinky.reactDashNavigationDashStack.Anon_TintColor
import typingsSlinky.reactDashNavigationDashStack.TextPropschildrenstring
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.inverted
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackOptions extends js.Object {
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined
  var gestureDirection: js.UndefOr[inverted | normal] = js.undefined
  var gestureResponseDistance: js.UndefOr[Anon_Horizontal] = js.undefined
  var gesturesEnabled: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[(js.Function1[/* props */ HeaderProps, TagMod[Any]]) | Null] = js.undefined
  var headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerBackImage: js.UndefOr[js.Function1[/* props */ Anon_TintColor, TagMod[Any]]] = js.undefined
  var headerBackTitle: js.UndefOr[String | Null] = js.undefined
  var headerBackTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerBackground: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.undefined
  var headerForceInset: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any
  ] = js.undefined
  var headerLeft: js.UndefOr[(js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var headerLeftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerPressColorAndroid: js.UndefOr[String] = js.undefined
  var headerRight: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.undefined
  var headerRightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerShown: js.UndefOr[Boolean] = js.undefined
  var headerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTintColor: js.UndefOr[String] = js.undefined
  var headerTitle: js.UndefOr[(js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined
  var headerTitleContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerTransparent: js.UndefOr[Boolean] = js.undefined
  var headerTruncatedBackTitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationStackOptions {
  @scala.inline
  def apply(
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    gestureDirection: inverted | normal = null,
    gestureResponseDistance: Anon_Horizontal = null,
    gesturesEnabled: js.UndefOr[Boolean] = js.undefined,
    header: /* props */ HeaderProps => TagMod[Any] = null,
    headerBackAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerBackImage: /* props */ Anon_TintColor => TagMod[Any] = null,
    headerBackTitle: String = null,
    headerBackTitleStyle: StyleProp[TextStyle] = null,
    headerBackground: js.Function0[TagMod[Any]] | TagMod[Any] = null,
    headerForceInset: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.ComponentClass<react-navigation.react-navigation.SafeAreaViewProps, react.react.ComponentState> & new (props : react-navigation.react-navigation.SafeAreaViewProps): react-navigation.react-navigation.SafeAreaView>['forceInset'] */ js.Any = null,
    headerLeft: (js.Function1[/* props */ HeaderBackButtonProps, TagMod[Any]]) | TagMod[Any] = null,
    headerLeftContainerStyle: StyleProp[ViewStyle] = null,
    headerPressColorAndroid: String = null,
    headerRight: js.Function0[TagMod[Any]] | TagMod[Any] = null,
    headerRightContainerStyle: StyleProp[ViewStyle] = null,
    headerShown: js.UndefOr[Boolean] = js.undefined,
    headerStyle: StyleProp[ViewStyle] = null,
    headerTintColor: String = null,
    headerTitle: (js.Function1[/* props */ TextPropschildrenstring, TagMod[Any]]) | TagMod[Any] = null,
    headerTitleAllowFontScaling: js.UndefOr[Boolean] = js.undefined,
    headerTitleContainerStyle: StyleProp[ViewStyle] = null,
    headerTitleStyle: StyleProp[TextStyle] = null,
    headerTransparent: js.UndefOr[Boolean] = js.undefined,
    headerTruncatedBackTitle: String = null,
    title: String = null
  ): NavigationStackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.asInstanceOf[js.Any])
    if (gestureDirection != null) __obj.updateDynamic("gestureDirection")(gestureDirection.asInstanceOf[js.Any])
    if (gestureResponseDistance != null) __obj.updateDynamic("gestureResponseDistance")(gestureResponseDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(gesturesEnabled)) __obj.updateDynamic("gesturesEnabled")(gesturesEnabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(js.Any.fromFunction1(header))
    if (!js.isUndefined(headerBackAllowFontScaling)) __obj.updateDynamic("headerBackAllowFontScaling")(headerBackAllowFontScaling.asInstanceOf[js.Any])
    if (headerBackImage != null) __obj.updateDynamic("headerBackImage")(js.Any.fromFunction1(headerBackImage))
    if (headerBackTitle != null) __obj.updateDynamic("headerBackTitle")(headerBackTitle.asInstanceOf[js.Any])
    if (headerBackTitleStyle != null) __obj.updateDynamic("headerBackTitleStyle")(headerBackTitleStyle.asInstanceOf[js.Any])
    if (headerBackground != null) __obj.updateDynamic("headerBackground")(headerBackground.asInstanceOf[js.Any])
    if (headerForceInset != null) __obj.updateDynamic("headerForceInset")(headerForceInset.asInstanceOf[js.Any])
    if (headerLeft != null) __obj.updateDynamic("headerLeft")(headerLeft.asInstanceOf[js.Any])
    if (headerLeftContainerStyle != null) __obj.updateDynamic("headerLeftContainerStyle")(headerLeftContainerStyle.asInstanceOf[js.Any])
    if (headerPressColorAndroid != null) __obj.updateDynamic("headerPressColorAndroid")(headerPressColorAndroid.asInstanceOf[js.Any])
    if (headerRight != null) __obj.updateDynamic("headerRight")(headerRight.asInstanceOf[js.Any])
    if (headerRightContainerStyle != null) __obj.updateDynamic("headerRightContainerStyle")(headerRightContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerShown)) __obj.updateDynamic("headerShown")(headerShown.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTintColor != null) __obj.updateDynamic("headerTintColor")(headerTintColor.asInstanceOf[js.Any])
    if (headerTitle != null) __obj.updateDynamic("headerTitle")(headerTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTitleAllowFontScaling)) __obj.updateDynamic("headerTitleAllowFontScaling")(headerTitleAllowFontScaling.asInstanceOf[js.Any])
    if (headerTitleContainerStyle != null) __obj.updateDynamic("headerTitleContainerStyle")(headerTitleContainerStyle.asInstanceOf[js.Any])
    if (headerTitleStyle != null) __obj.updateDynamic("headerTitleStyle")(headerTitleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTransparent)) __obj.updateDynamic("headerTransparent")(headerTransparent.asInstanceOf[js.Any])
    if (headerTruncatedBackTitle != null) __obj.updateDynamic("headerTruncatedBackTitle")(headerTruncatedBackTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackOptions]
  }
}

