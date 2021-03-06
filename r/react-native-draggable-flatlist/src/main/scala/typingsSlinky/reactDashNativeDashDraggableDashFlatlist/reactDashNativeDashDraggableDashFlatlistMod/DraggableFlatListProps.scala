package typingsSlinky.reactDashNativeDashDraggableDashFlatlist.reactDashNativeDashDraggableDashFlatlistMod

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactDashNative.Anon_ActionName
import typingsSlinky.reactDashNative.Anon_AverageItemLength
import typingsSlinky.reactDashNative.Anon_Changed
import typingsSlinky.reactDashNative.Anon_DistanceFromEnd
import typingsSlinky.reactDashNative.Anon_Index
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityActionInfo
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityRole
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityState
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityStates
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typingsSlinky.reactDashNative.reactDashNativeMod.Insets
import typingsSlinky.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeScrollEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeTouchEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NodeHandle
import typingsSlinky.reactDashNative.reactDashNativeMod.PointPropType
import typingsSlinky.reactDashNative.reactDashNativeMod.ScrollViewProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewabilityConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewabilityConfigCallbackPairs
import typingsSlinky.reactDashNative.reactDashNativeMod.VirtualizedListWithoutRenderItemProps
import typingsSlinky.reactDashNative.reactDashNativeStrings.`box-none`
import typingsSlinky.reactDashNative.reactDashNativeStrings.`box-only`
import typingsSlinky.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typingsSlinky.reactDashNative.reactDashNativeStrings.`on-drag`
import typingsSlinky.reactDashNative.reactDashNativeStrings.always
import typingsSlinky.reactDashNative.reactDashNativeStrings.assertive
import typingsSlinky.reactDashNative.reactDashNativeStrings.auto
import typingsSlinky.reactDashNative.reactDashNativeStrings.automatic
import typingsSlinky.reactDashNative.reactDashNativeStrings.black
import typingsSlinky.reactDashNative.reactDashNativeStrings.button
import typingsSlinky.reactDashNative.reactDashNativeStrings.center
import typingsSlinky.reactDashNative.reactDashNativeStrings.end
import typingsSlinky.reactDashNative.reactDashNativeStrings.fast
import typingsSlinky.reactDashNative.reactDashNativeStrings.handled
import typingsSlinky.reactDashNative.reactDashNativeStrings.interactive
import typingsSlinky.reactDashNative.reactDashNativeStrings.never
import typingsSlinky.reactDashNative.reactDashNativeStrings.no
import typingsSlinky.reactDashNative.reactDashNativeStrings.none
import typingsSlinky.reactDashNative.reactDashNativeStrings.normal_
import typingsSlinky.reactDashNative.reactDashNativeStrings.polite
import typingsSlinky.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typingsSlinky.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typingsSlinky.reactDashNative.reactDashNativeStrings.scrollableAxes
import typingsSlinky.reactDashNative.reactDashNativeStrings.start
import typingsSlinky.reactDashNative.reactDashNativeStrings.white
import typingsSlinky.reactDashNative.reactDashNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableFlatListProps[Item] extends VirtualizedListWithoutRenderItemProps[Item] {
  /**
    * Items to be rendered.
    */
  @JSName("data")
  var data_DraggableFlatListProps: js.Array[Item] | Null
  /**
    * Function that is called when row becomes active.
    */
  var onMoveBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  /**
    *  Function that returns updated ordering of data
    */
  var onMoveEnd: js.UndefOr[js.Function1[/* info */ OnMoveEndInfo[Item], Unit]] = js.undefined
  /**
    * Sets where scrolling begins.
    *
    * Default is 5
    */
  var scrollPercent: js.UndefOr[Double] = js.undefined
  /**
    * Function that calls move when the row should become active (in an onPress, onLongPress, etc). Calls moveEnd when the gesture is complete (in onPressOut).
    */
  def renderItem(info: RenderItemInfo[Item]): ReactElement | Null
}

object DraggableFlatListProps {
  @scala.inline
  def apply[Item](
    renderItem: RenderItemInfo[Item] => ReactElement | Null,
    ListEmptyComponent: ReactComponentClass[_] | ReactElement = null,
    ListFooterComponent: ReactComponentClass[_] | ReactElement = null,
    ListHeaderComponent: ReactComponentClass[_] | ReactElement = null,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
    alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
    automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
    bounces: js.UndefOr[Boolean] = js.undefined,
    bouncesZoom: js.UndefOr[Boolean] = js.undefined,
    canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
    centerContent: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    contentInset: Insets = null,
    contentInsetAdjustmentBehavior: automatic | scrollableAxes | never | always = null,
    contentOffset: PointPropType = null,
    data: js.Array[Item] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    decelerationRate: fast | normal_ | Double = null,
    directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
    disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined,
    disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined,
    disableVirtualization: js.UndefOr[Boolean] = js.undefined,
    endFillColor: String = null,
    extraData: js.Any = null,
    getItem: (/* data */ js.Any, /* index */ Double) => Item = null,
    getItemCount: /* data */ js.Any => Double = null,
    getItemLayout: (/* data */ js.Any, /* index */ Double) => Anon_Index = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    indicatorStyle: typingsSlinky.reactDashNative.reactDashNativeStrings.default | black | white = null,
    initialNumToRender: Int | Double = null,
    initialScrollIndex: Int | Double = null,
    invertStickyHeaders: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyExtractor: (Item, /* index */ Double) => String = null,
    keyboardDismissMode: none | interactive | `on-drag` = null,
    keyboardShouldPersistTaps: Boolean | always | never | handled = null,
    listKey: String = null,
    maxToRenderPerBatch: Int | Double = null,
    maximumZoomScale: Int | Double = null,
    minimumZoomScale: Int | Double = null,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: SyntheticEvent[NodeHandle, Anon_ActionName] => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onContentSizeChange: (/* w */ Double, /* h */ Double) => Unit = null,
    onEndReached: /* info */ Anon_DistanceFromEnd => Unit = null,
    onEndReachedThreshold: Int | Double = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMomentumScrollBegin: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onMomentumScrollEnd: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onMoveBegin: /* index */ Double => Unit = null,
    onMoveEnd: /* info */ OnMoveEndInfo[Item] => Unit = null,
    onMoveShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onMoveShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onRefresh: () => Unit = null,
    onResponderEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderGrant: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderReject: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderRelease: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminate: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminationRequest: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onScroll: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onScrollAnimationEnd: () => Unit = null,
    onScrollBeginDrag: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onScrollEndDrag: SyntheticEvent[NodeHandle, NativeScrollEvent] => Unit = null,
    onScrollToIndexFailed: /* info */ Anon_AverageItemLength => Unit = null,
    onStartShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onTouchCancel: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEndCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onViewableItemsChanged: /* info */ Anon_Changed => Unit = null,
    overScrollMode: auto | always | never = null,
    pagingEnabled: js.UndefOr[Boolean] = js.undefined,
    pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    progressViewOffset: Int | Double = null,
    refreshControl: ReactElement = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderScrollComponent: /* props */ ScrollViewProps => ReactElement = null,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEventThrottle: Int | Double = null,
    scrollIndicatorInsets: Insets = null,
    scrollPercent: Int | Double = null,
    scrollPerfTag: String = null,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    snapToAlignment: start | center | end = null,
    snapToEnd: js.UndefOr[Boolean] = js.undefined,
    snapToInterval: Int | Double = null,
    snapToOffsets: js.Array[Double] = null,
    snapToStart: js.UndefOr[Boolean] = js.undefined,
    stickyHeaderIndices: js.Array[Double] = null,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    updateCellsBatchingPeriod: Int | Double = null,
    viewabilityConfig: ViewabilityConfig = null,
    viewabilityConfigCallbackPairs: ViewabilityConfigCallbackPairs = null,
    windowSize: Int | Double = null,
    zoomScale: Int | Double = null
  ): DraggableFlatListProps[Item] = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
    if (ListEmptyComponent != null) __obj.updateDynamic("ListEmptyComponent")(ListEmptyComponent.asInstanceOf[js.Any])
    if (ListFooterComponent != null) __obj.updateDynamic("ListFooterComponent")(ListFooterComponent.asInstanceOf[js.Any])
    if (ListHeaderComponent != null) __obj.updateDynamic("ListHeaderComponent")(ListHeaderComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceHorizontal)) __obj.updateDynamic("alwaysBounceHorizontal")(alwaysBounceHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceVertical)) __obj.updateDynamic("alwaysBounceVertical")(alwaysBounceVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (!js.isUndefined(bouncesZoom)) __obj.updateDynamic("bouncesZoom")(bouncesZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(canCancelContentTouches)) __obj.updateDynamic("canCancelContentTouches")(canCancelContentTouches.asInstanceOf[js.Any])
    if (!js.isUndefined(centerContent)) __obj.updateDynamic("centerContent")(centerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (contentInsetAdjustmentBehavior != null) __obj.updateDynamic("contentInsetAdjustmentBehavior")(contentInsetAdjustmentBehavior.asInstanceOf[js.Any])
    if (contentOffset != null) __obj.updateDynamic("contentOffset")(contentOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalLockEnabled)) __obj.updateDynamic("directionalLockEnabled")(directionalLockEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIntervalMomentum)) __obj.updateDynamic("disableIntervalMomentum")(disableIntervalMomentum.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollViewPanResponder)) __obj.updateDynamic("disableScrollViewPanResponder")(disableScrollViewPanResponder.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVirtualization)) __obj.updateDynamic("disableVirtualization")(disableVirtualization.asInstanceOf[js.Any])
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (getItem != null) __obj.updateDynamic("getItem")(js.Any.fromFunction2(getItem))
    if (getItemCount != null) __obj.updateDynamic("getItemCount")(js.Any.fromFunction1(getItemCount))
    if (getItemLayout != null) __obj.updateDynamic("getItemLayout")(js.Any.fromFunction2(getItemLayout))
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (initialNumToRender != null) __obj.updateDynamic("initialNumToRender")(initialNumToRender.asInstanceOf[js.Any])
    if (initialScrollIndex != null) __obj.updateDynamic("initialScrollIndex")(initialScrollIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(invertStickyHeaders)) __obj.updateDynamic("invertStickyHeaders")(invertStickyHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2(keyExtractor))
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (listKey != null) __obj.updateDynamic("listKey")(listKey.asInstanceOf[js.Any])
    if (maxToRenderPerBatch != null) __obj.updateDynamic("maxToRenderPerBatch")(maxToRenderPerBatch.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction2(onContentSizeChange))
    if (onEndReached != null) __obj.updateDynamic("onEndReached")(js.Any.fromFunction1(onEndReached))
    if (onEndReachedThreshold != null) __obj.updateDynamic("onEndReachedThreshold")(onEndReachedThreshold.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMomentumScrollBegin != null) __obj.updateDynamic("onMomentumScrollBegin")(js.Any.fromFunction1(onMomentumScrollBegin))
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction1(onMomentumScrollEnd))
    if (onMoveBegin != null) __obj.updateDynamic("onMoveBegin")(js.Any.fromFunction1(onMoveBegin))
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction1(onMoveEnd))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction0(onRefresh))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollAnimationEnd != null) __obj.updateDynamic("onScrollAnimationEnd")(js.Any.fromFunction0(onScrollAnimationEnd))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction1(onScrollBeginDrag))
    if (onScrollEndDrag != null) __obj.updateDynamic("onScrollEndDrag")(js.Any.fromFunction1(onScrollEndDrag))
    if (onScrollToIndexFailed != null) __obj.updateDynamic("onScrollToIndexFailed")(js.Any.fromFunction1(onScrollToIndexFailed))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onViewableItemsChanged != null) __obj.updateDynamic("onViewableItemsChanged")(js.Any.fromFunction1(onViewableItemsChanged))
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchGestureEnabled)) __obj.updateDynamic("pinchGestureEnabled")(pinchGestureEnabled.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (progressViewOffset != null) __obj.updateDynamic("progressViewOffset")(progressViewOffset.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderScrollComponent != null) __obj.updateDynamic("renderScrollComponent")(js.Any.fromFunction1(renderScrollComponent))
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (scrollEventThrottle != null) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.asInstanceOf[js.Any])
    if (scrollIndicatorInsets != null) __obj.updateDynamic("scrollIndicatorInsets")(scrollIndicatorInsets.asInstanceOf[js.Any])
    if (scrollPercent != null) __obj.updateDynamic("scrollPercent")(scrollPercent.asInstanceOf[js.Any])
    if (scrollPerfTag != null) __obj.updateDynamic("scrollPerfTag")(scrollPerfTag.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (snapToAlignment != null) __obj.updateDynamic("snapToAlignment")(snapToAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToEnd)) __obj.updateDynamic("snapToEnd")(snapToEnd.asInstanceOf[js.Any])
    if (snapToInterval != null) __obj.updateDynamic("snapToInterval")(snapToInterval.asInstanceOf[js.Any])
    if (snapToOffsets != null) __obj.updateDynamic("snapToOffsets")(snapToOffsets.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStart)) __obj.updateDynamic("snapToStart")(snapToStart.asInstanceOf[js.Any])
    if (stickyHeaderIndices != null) __obj.updateDynamic("stickyHeaderIndices")(stickyHeaderIndices.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (updateCellsBatchingPeriod != null) __obj.updateDynamic("updateCellsBatchingPeriod")(updateCellsBatchingPeriod.asInstanceOf[js.Any])
    if (viewabilityConfig != null) __obj.updateDynamic("viewabilityConfig")(viewabilityConfig.asInstanceOf[js.Any])
    if (viewabilityConfigCallbackPairs != null) __obj.updateDynamic("viewabilityConfigCallbackPairs")(viewabilityConfigCallbackPairs.asInstanceOf[js.Any])
    if (windowSize != null) __obj.updateDynamic("windowSize")(windowSize.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableFlatListProps[Item]]
  }
}

