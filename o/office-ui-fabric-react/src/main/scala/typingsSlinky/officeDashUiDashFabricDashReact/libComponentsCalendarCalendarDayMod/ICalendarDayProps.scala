package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDayMod

import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarIconStrings
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarStrings
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DateRangeType
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.DayOfWeek
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDateValuesDateValuesMod.FirstWeekOfYear
import typingsSlinky.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarDayProps extends ClassAttributes[CalendarDay] {
  var allFocusable: js.UndefOr[Boolean] = js.native
  var autoNavigateOnSelection: Boolean = js.native
  var componentRef: js.UndefOr[IRefObject[ICalendarDay]] = js.native
  var dateRangeType: DateRangeType = js.native
  var dateTimeFormatter: ICalendarFormatDateCallbacks = js.native
  var firstDayOfWeek: DayOfWeek = js.native
  var firstWeekOfYear: FirstWeekOfYear = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var navigatedDate: js.Date = js.native
  var navigationIcons: ICalendarIconStrings = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
  var restrictedDates: js.UndefOr[js.Array[js.Date]] = js.native
  var selectedDate: js.Date = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var showSixWeeksByDefault: js.UndefOr[Boolean] = js.native
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  var strings: ICalendarStrings = js.native
  var today: js.UndefOr[js.Date] = js.native
  var workWeekDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
  def onNavigateDate(date: js.Date, focusOnNavigatedDay: Boolean): Unit = js.native
  def onSelectDate(date: js.Date): Unit = js.native
  def onSelectDate(date: js.Date, selectedDateRangeArray: js.Array[js.Date]): Unit = js.native
}

