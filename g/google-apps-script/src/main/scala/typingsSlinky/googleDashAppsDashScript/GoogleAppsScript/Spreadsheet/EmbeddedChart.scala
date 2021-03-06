package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartOptions
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a chart that has been embedded into a spreadsheet.
  *
  * This example shows how to modify an existing chart:
  *
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange("A2:B8")
  *     var chart = sheet.getCharts()[0];
  *     chart = chart.modify()
  *         .addRange(range)
  *         .setOption('title', 'Updated!')
  *         .setOption('animation.duration', 500)
  *         .setPosition(2,2,0,0)
  *         .build();
  *     sheet.updateChart(chart);
  *
  * This example shows how to create a new chart:
  *
  *     function newChart(range, sheet) {
  *       var sheet = SpreadsheetApp.getActiveSheet();
  *       var chartBuilder = sheet.newChart();
  *       chartBuilder.addRange(range)
  *           .setChartType(Charts.ChartType.LINE)
  *           .setOption('title', 'My Line Chart!');
  *       sheet.insertChart(chartBuilder.build());
  *     }
  */
trait EmbeddedChart extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getChartId(): Integer | Null
  def getContainerInfo(): ContainerInfo
  def getHiddenDimensionStrategy(): ChartHiddenDimensionStrategy
  def getMergeStrategy(): ChartMergeStrategy
  def getNumHeaders(): Integer
  def getOptions(): ChartOptions
  def getRanges(): js.Array[Range]
  def getTransposeRowsAndColumns(): Boolean
  def modify(): EmbeddedChartBuilder
}

object EmbeddedChart {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getChartId: () => Integer | Null,
    getContainerInfo: () => ContainerInfo,
    getHiddenDimensionStrategy: () => ChartHiddenDimensionStrategy,
    getMergeStrategy: () => ChartMergeStrategy,
    getNumHeaders: () => Integer,
    getOptions: () => ChartOptions,
    getRanges: () => js.Array[Range],
    getTransposeRowsAndColumns: () => Boolean,
    modify: () => EmbeddedChartBuilder
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getChartId = js.Any.fromFunction0(getChartId), getContainerInfo = js.Any.fromFunction0(getContainerInfo), getHiddenDimensionStrategy = js.Any.fromFunction0(getHiddenDimensionStrategy), getMergeStrategy = js.Any.fromFunction0(getMergeStrategy), getNumHeaders = js.Any.fromFunction0(getNumHeaders), getOptions = js.Any.fromFunction0(getOptions), getRanges = js.Any.fromFunction0(getRanges), getTransposeRowsAndColumns = js.Any.fromFunction0(getTransposeRowsAndColumns), modify = js.Any.fromFunction0(modify))
  
    __obj.asInstanceOf[EmbeddedChart]
  }
}

