package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.Anon_CriticalBoolean
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsSlinky.jsrsasign.jsrsasignStrings.authorityinfoaccess
import typingsSlinky.jsrsasign.jsrsasignStrings.authoritykeyidentifier
import typingsSlinky.jsrsasign.jsrsasignStrings.basicconstraints
import typingsSlinky.jsrsasign.jsrsasignStrings.crldistributionpoints
import typingsSlinky.jsrsasign.jsrsasignStrings.extkeyusage
import typingsSlinky.jsrsasign.jsrsasignStrings.issueraltname
import typingsSlinky.jsrsasign.jsrsasignStrings.keyusage
import typingsSlinky.jsrsasign.jsrsasignStrings.subjectaltname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base Extension ASN.1 structure class
  * @param params associative array of parameters (ex. {'critical': true})
  * @example
  * ```
  * // Extension  ::=  SEQUENCE  {
  * //     extnID      OBJECT IDENTIFIER,
  * //     critical    BOOLEAN DEFAULT FALSE,
  * //     extnValue   OCTET STRING  }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.Extension")
@js.native
class Extension () extends ASN1Object {
  def this(params: Anon_CriticalBoolean) = this()
}

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.x509.Extension")
@js.native
object Extension extends js.Object {
  @JSName("appendByNameToArray")
  def appendByNameToArray_authorityinfoaccess(name: authorityinfoaccess, extParams: Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_authoritykeyidentifier(name: authoritykeyidentifier, extParams: Extension, a: js.Array[_]): Unit = js.native
  /**
    * append X.509v3 extension to any specified array
    * @param name X.509v3 extension name
    * @param extParams associative array of extension parameters
    * @param a array to add specified extension
    * @see KJUR.asn1.x509.Extension
    * @description
    * This static function add a X.509v3 extension specified by name and extParams to
    * array 'a' so that 'a' will be an array of X.509v3 extension objects.
    * @example
    * var a = new Array();
    * KJUR.asn1.x509.Extension.appendByNameToArray("BasicConstraints", {'cA':true, 'critical': true}, a);
    * KJUR.asn1.x509.Extension.appendByNameToArray("KeyUsage", {'bin':'11'}, a);
    */
  @JSName("appendByNameToArray")
  def appendByNameToArray_basicconstraints(name: basicconstraints, extParams: Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_crldistributionpoints(name: crldistributionpoints, extParams: Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_extkeyusage(name: extkeyusage, extParams: Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_issueraltname(name: issueraltname, extParams: Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_keyusage(name: keyusage, extParams: Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_subjectaltname(name: subjectaltname, extParams: Extension, a: js.Array[_]): Unit = js.native
}

