package typingsSlinky.extjs.Ext.selection

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IClass
import typingsSlinky.extjs.Ext.data.IAbstractStore
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellModel extends IModel {
  /** [Method] Deselects a record instance by record instance or index
  		* @param record Object
  		* @param suppressEvent Object
  		*/
  @JSName("deselect")
  var deselect_ICellModel: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current position in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] ("SINGLE") */
  @JSName("mode")
  var mode_ICellModel: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventWrap: js.UndefOr[Boolean] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param pos Object
  		* @param keepExisting Object
  		* @param suppressEvent Object
  		*/
  @JSName("select")
  var select_ICellModel: js.UndefOr[
    js.Function3[
      /* pos */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the current position
  		* @param position Object The position to set.
  		* @param suppressEvent Boolean True to suppress selection events
  		*/
  var setCurrentPosition: js.UndefOr[
    js.Function2[/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}

object ICellModel {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit]) = null,
    bindStoreListeners: js.UndefOr[IAbstractStore] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    deselect: (/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Unit = null,
    deselectAll: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    deselectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    enableKeyNav: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getCount: () => Double = null,
    getCurrentPosition: () => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLastSelected: () => ICellModel = null,
    getSelection: () => Array = null,
    getSelectionMode: () => String = null,
    getStore: () => IAbstractStore = null,
    getStoreListeners: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _]) = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    hasSelection: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ICellModel = null,
    isFocused: /* record */ js.UndefOr[ICellModel] => Unit = null,
    isLocked: () => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isRangeSelected: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => Boolean = null,
    isSelected: /* record */ js.UndefOr[js.Any] => Boolean = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onBindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit = null,
    onUnbindStore: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit = null,
    preventWrap: js.UndefOr[Boolean] = js.undefined,
    pruneRemoved: js.UndefOr[Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    select: (/* pos */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Unit = null,
    selectAll: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    selectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Unit = null,
    selected: IMixedCollection = null,
    self: IClass = null,
    setCurrentPosition: (/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit = null,
    setLastFocused: /* record */ js.UndefOr[ICellModel] => Unit = null,
    setLocked: /* locked */ js.UndefOr[Boolean] => Unit = null,
    setSelectionMode: /* selMode */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    toggleOnClick: js.UndefOr[Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    unbindStoreListeners: js.UndefOr[IAbstractStore] => Unit = null,
    uses: Array = null
  ): ICellModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore.asInstanceOf[js.Any])
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(js.Any.fromFunction2(deselectRange))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getCurrentPosition != null) __obj.updateDynamic("getCurrentPosition")(js.Any.fromFunction0(getCurrentPosition))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isFocused != null) __obj.updateDynamic("isFocused")(js.Any.fromFunction1(isFocused))
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(js.Any.fromFunction2(isRangeSelected))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (!js.isUndefined(preventWrap)) __obj.updateDynamic("preventWrap")(preventWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCurrentPosition != null) __obj.updateDynamic("setCurrentPosition")(js.Any.fromFunction2(setCurrentPosition))
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction1(setLastFocused))
    if (setLocked != null) __obj.updateDynamic("setLocked")(js.Any.fromFunction1(setLocked))
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(js.Any.fromFunction1(setSelectionMode))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellModel]
  }
}

