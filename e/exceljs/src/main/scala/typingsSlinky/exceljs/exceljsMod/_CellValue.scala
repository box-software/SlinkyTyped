package typingsSlinky.exceljs.exceljsMod

import typingsSlinky.exceljs.Anon_Error
import typingsSlinky.exceljs.exceljsStrings.NumbersignDIVSlash0Exclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNAMEQuestionmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNSlashA
import typingsSlinky.exceljs.exceljsStrings.NumbersignNULLExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignNUMExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignREFExclamationmark
import typingsSlinky.exceljs.exceljsStrings.NumbersignVALUEExclamationmark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CellValue extends js.Object

object _CellValue {
  @scala.inline
  def CellHyperlinkValue(hyperlink: String, text: String): _CellValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellSharedFormulaValue(
    date1904: Boolean,
    sharedFormula: String,
    formula: String = null,
    result: Double | String | js.Date | Anon_Error = null
  ): _CellValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], sharedFormula = sharedFormula.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellRichTextValue(richText: js.Array[RichText]): _CellValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellErrorValue(
    error: NumbersignNSlashA | NumbersignREFExclamationmark | NumbersignNAMEQuestionmark | NumbersignDIVSlash0Exclamationmark | NumbersignNULLExclamationmark | NumbersignVALUEExclamationmark | NumbersignNUMExclamationmark
  ): _CellValue = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_CellValue]
  }
  @scala.inline
  def CellFormulaValue(date1904: Boolean, formula: String, result: Double | String | js.Date | Anon_Error = null): _CellValue = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any], formula = formula.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CellValue]
  }
}

