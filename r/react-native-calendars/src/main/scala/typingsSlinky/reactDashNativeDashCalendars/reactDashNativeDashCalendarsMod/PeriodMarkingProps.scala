package typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactDashNativeDashCalendars.reactDashNativeDashCalendarsStrings.period
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodMarkingProps extends _CalendarMarkingProps {
  var markedDates: StringDictionary[PeriodMarking]
  var markingType: period
}

object PeriodMarkingProps {
  @scala.inline
  def apply(markedDates: StringDictionary[PeriodMarking], markingType: period): PeriodMarkingProps = {
    val __obj = js.Dynamic.literal(markedDates = markedDates.asInstanceOf[js.Any], markingType = markingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PeriodMarkingProps]
  }
}

