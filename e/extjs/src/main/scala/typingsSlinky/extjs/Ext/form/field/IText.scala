package typingsSlinky.extjs.Ext.form.field

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText extends IBase {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOnlyWhitespace: js.UndefOr[Boolean] = js.undefined
  /** [Method] Automatically grows the field to accomodate the width of the text up to the maximum field width allowed  */
  var autoSize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] private */
  @JSName("beforeFocus")
  var beforeFocus_IText: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var blankText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableKeyFilter: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var emptyCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyEvents: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enforceMaxLength: js.UndefOr[Boolean] = js.undefined
  /** [Method] Validates a value according to the field s validation rules and returns an array of errors for any failing validations
  		* @param value Object The value to validate. The processed raw value will be used if nothing is passed.
  		* @returns String[] Array of any validation errors
  		*/
  @JSName("getErrors")
  var getErrors_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Returns the raw String value of the field without performing any normalization conversion or validation
  		* @returns String The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Boolean) */
  var grow: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var growAppend: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var growMax: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var growMin: js.UndefOr[Double] = js.undefined
  /** [Config Option] (RegExp) */
  var maskRe: js.UndefOr[js.RegExp] = js.undefined
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var maxLengthText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var minLength: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var minLengthText: js.UndefOr[String] = js.undefined
  /** [Method] private */
  @JSName("postBlur")
  var postBlur_IText: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Performs any necessary manipulation of a raw String value to prepare it for conversion and or validation
  		* @param value String The unprocessed string value
  		* @returns String The processed string value
  		*/
  @JSName("processRawValue")
  var processRawValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], String]] = js.undefined
  /** [Config Option] (RegExp) */
  var regex: js.UndefOr[js.RegExp] = js.undefined
  /** [Config Option] (String) */
  var regexText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_IText: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var selectOnFocus: js.UndefOr[Boolean] = js.undefined
  /** [Method] Selects text in this field
  		* @param start Number The index where the selection should start
  		* @param end Number The index where the selection should end (defaults to the text length)
  		*/
  var selectText: js.UndefOr[js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.undefined
  /** [Config Option] (RegExp) */
  var stripCharsRe: js.UndefOr[js.RegExp] = js.undefined
  /** [Config Option] (Boolean) */
  var validateBlank: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var validator: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var vtype: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var vtypeText: js.UndefOr[String] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IBase: IBase = null,
    allowBlank: js.UndefOr[Boolean] = js.undefined,
    allowOnlyWhitespace: js.UndefOr[Boolean] = js.undefined,
    autoSize: () => Unit = null,
    beforeFocus: () => Unit = null,
    blankText: String = null,
    disableKeyFilter: js.UndefOr[Boolean] = js.undefined,
    emptyCls: String = null,
    emptyText: String = null,
    enableKeyEvents: js.UndefOr[Boolean] = js.undefined,
    enforceMaxLength: js.UndefOr[Boolean] = js.undefined,
    getErrors: /* value */ js.UndefOr[js.Any] => Array = null,
    getRawValue: () => String = null,
    grow: js.UndefOr[Boolean] = js.undefined,
    growAppend: String = null,
    growMax: Int | Double = null,
    growMin: Int | Double = null,
    maskRe: js.RegExp = null,
    maxLength: Int | Double = null,
    maxLengthText: String = null,
    minLength: Int | Double = null,
    minLengthText: String = null,
    postBlur: () => Unit = null,
    processRawValue: /* value */ js.UndefOr[String] => String = null,
    regex: js.RegExp = null,
    regexText: String = null,
    requiredCls: String = null,
    reset: () => Unit = null,
    selectOnFocus: js.UndefOr[Boolean] = js.undefined,
    selectText: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => _ = null,
    size: Int | Double = null,
    stripCharsRe: js.RegExp = null,
    validateBlank: js.UndefOr[Boolean] = js.undefined,
    validator: js.Any = null,
    vtype: String = null,
    vtypeText: String = null
  ): IText = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    if (!js.isUndefined(allowBlank)) __obj.updateDynamic("allowBlank")(allowBlank.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOnlyWhitespace)) __obj.updateDynamic("allowOnlyWhitespace")(allowOnlyWhitespace.asInstanceOf[js.Any])
    if (autoSize != null) __obj.updateDynamic("autoSize")(js.Any.fromFunction0(autoSize))
    if (beforeFocus != null) __obj.updateDynamic("beforeFocus")(js.Any.fromFunction0(beforeFocus))
    if (blankText != null) __obj.updateDynamic("blankText")(blankText.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyFilter)) __obj.updateDynamic("disableKeyFilter")(disableKeyFilter.asInstanceOf[js.Any])
    if (emptyCls != null) __obj.updateDynamic("emptyCls")(emptyCls.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyEvents)) __obj.updateDynamic("enableKeyEvents")(enableKeyEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceMaxLength)) __obj.updateDynamic("enforceMaxLength")(enforceMaxLength.asInstanceOf[js.Any])
    if (getErrors != null) __obj.updateDynamic("getErrors")(js.Any.fromFunction1(getErrors))
    if (getRawValue != null) __obj.updateDynamic("getRawValue")(js.Any.fromFunction0(getRawValue))
    if (!js.isUndefined(grow)) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (growAppend != null) __obj.updateDynamic("growAppend")(growAppend.asInstanceOf[js.Any])
    if (growMax != null) __obj.updateDynamic("growMax")(growMax.asInstanceOf[js.Any])
    if (growMin != null) __obj.updateDynamic("growMin")(growMin.asInstanceOf[js.Any])
    if (maskRe != null) __obj.updateDynamic("maskRe")(maskRe.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLengthText != null) __obj.updateDynamic("maxLengthText")(maxLengthText.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minLengthText != null) __obj.updateDynamic("minLengthText")(minLengthText.asInstanceOf[js.Any])
    if (postBlur != null) __obj.updateDynamic("postBlur")(js.Any.fromFunction0(postBlur))
    if (processRawValue != null) __obj.updateDynamic("processRawValue")(js.Any.fromFunction1(processRawValue))
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (regexText != null) __obj.updateDynamic("regexText")(regexText.asInstanceOf[js.Any])
    if (requiredCls != null) __obj.updateDynamic("requiredCls")(requiredCls.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (!js.isUndefined(selectOnFocus)) __obj.updateDynamic("selectOnFocus")(selectOnFocus.asInstanceOf[js.Any])
    if (selectText != null) __obj.updateDynamic("selectText")(js.Any.fromFunction2(selectText))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stripCharsRe != null) __obj.updateDynamic("stripCharsRe")(stripCharsRe.asInstanceOf[js.Any])
    if (!js.isUndefined(validateBlank)) __obj.updateDynamic("validateBlank")(validateBlank.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (vtype != null) __obj.updateDynamic("vtype")(vtype.asInstanceOf[js.Any])
    if (vtypeText != null) __obj.updateDynamic("vtypeText")(vtypeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IText]
  }
}

