package typingsSlinky.jsrsasign.jsrsasign

import typingsSlinky.jsrsasign.Anon_CA
import typingsSlinky.jsrsasign.Anon_Caissuer
import typingsSlinky.jsrsasign.Anon_Cps
import typingsSlinky.jsrsasign.Anon_CriticalOid
import typingsSlinky.jsrsasign.Anon_Kid
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typingsSlinky.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.X509")
@js.native
class X509 () extends js.Object {
  var hex: String = js.native
  /**
    * get AuthorityInfoAccess extension value in the certificate as associative array
    * @return associative array of AIA extension properties
    * @description
    * This method will get authority info access value
    * as associate array which has following properties:
    *
    * - ocsp - array of string for OCSP responder URL
    * - caissuer - array of string for caIssuer value (i.e. CA certificates URL)
    *
    * If there is this in the certificate, it returns undefined;
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtAIAInfo(hCert) →
    * { ocsp:     ["http://ocsp.foo.com"],
    *   caissuer: ["http://rep.foo.com/aaa.p8m"] }
    */
  def getExtAIAInfo(): js.UndefOr[Anon_Caissuer] = js.native
  /**
    * get authorityKeyIdentifier value as JSON object in the certificate
    * @return JSON object of authority key identifier or null
    * @description
    * This method will get authority key identifier extension value
    * as JSON object.
    * If there is this in the certificate, it returns undefined;
    *
    * NOTE: Currently this method only supports keyIdentifier so that
    * authorityCertIssuer and authorityCertSerialNumber will not
    * be return in the JSON object.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtAuthorityKeyIdentifier() → { kid: "1234abcd..." }
    */
  def getExtAuthorityKeyIdentifier(): Anon_Kid | Null = js.native
  /**
    * get BasicConstraints extension value as object in the certificate
    * @return associative array which may have "cA" and "pathLen" parameters
    * @description
    * This method will get basic constraints extension value as object with following paramters.
    *
    * - cA - CA flag whether CA or not
    * - pathLen - maximum intermediate certificate length
    *
    * There are use cases for return values:
    *
    * - {cA:true, pathLen:3} - cA flag is true and pathLen is 3
    * - {cA:true} - cA flag is true and no pathLen
    * - {} - basic constraints has no value in case of end entity certificate
    * - undefined - there is no basic constraints extension
    *
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtBasicConstraints() → { cA: true, pathLen: 3 };
    */
  def getExtBasicConstraints(): Anon_CA = js.native
  /**
    * get array of string for fullName URIs in cRLDistributionPoints(CDP) in the certificate
    * @return array of fullName URIs of CDP of the certificate
    * @description
    * This method will get all fullName URIs of cRLDistributionPoints extension
    * in the certificate as array of URI string.
    * If there is this in the certificate, it returns undefined;
    *
    * NOTE: Currently this method supports only fullName URI so that
    * other parameters will not be returned.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtCRLDistributionPointsURI() →
    * ["http://example.com/aaa.crl", "http://example.org/aaa.crl"]
    */
  def getExtCRLDistributionPointsURI(): js.UndefOr[js.Array[String]] = js.native
  /**
    * get CertificatePolicies extension value in the certificate as array
    * @return array of PolicyInformation JSON object
    * @description
    * This method will get certificate policies value
    * as an array of JSON object which has following properties:
    *
    * - id -
    * - cps - URI of certification practice statement
    * - unotice - string of UserNotice explicitText
    *
    * If there is this extension in the certificate,
    * it returns undefined;
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtCertificatePolicies →
    * [{ id: 1.2.3.4,
    *    cps: "http://example.com/cps",
    *    unotice: "explicit text" }]
    */
  def getExtCertificatePolicies(): js.UndefOr[Anon_Cps] = js.native
  /**
    * get extKeyUsage value as array of name string in the certificate
    * @return array of extended key usage ID name or oid
    * @description
    * This method will get extended key usage extension value
    * as array of name or OID string.
    * If there is this in the certificate, it returns undefined;
    *
    * NOTE: Supported extended key usage ID names are defined in
    * name2oidList parameter in asn1x509.js file.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtExtKeyUsageName() → ["serverAuth", "clientAuth", "0.1.2.3.4.5"]
    */
  def getExtExtKeyUsageName(): js.Array[String] = js.native
  /**
    * get a X.509v3 extesion information such as extension OID, criticality and value index for specified oid or name.
    * @param oidOrName X.509 extension oid or name (ex. keyUsage or 2.5.29.19)
    * @return X.509 extension information such as extension OID or value indx (see `X509#parseExt`)
    * @description
    * This method will get an X.509v3 extension information JSON object
    * having extension OID, criticality and value idx for specified
    * extension OID or name.
    * If there is no such extension, this returns undefined.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    *
    * x.getExtInfo("keyUsage") → { oid: "2.5.29.15", critical: true, vidx: 1714 }
    * x.getExtInfo("unknownExt") → undefined
    */
  def getExtInfo(oidOrName: String): X509Extension = js.native
  /**
    * get KeyUsage extension value as binary string in the certificate
    * @return binary string of key usage bits (ex. '101')
    * @description
    * This method will get key usage extension value
    * as binary string such like '101'.
    * Key usage bits definition is in the RFC 5280.
    * If there is no key usage extension in the certificate,
    * it returns empty string (i.e. '').
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtKeyUsageBin() → '101'
    * // 1 - digitalSignature
    * // 0 - nonRepudiation
    * // 1 - keyEncipherment
    */
  def getExtKeyUsageBin(): String = js.native
  /**
    * get KeyUsage extension value as names in the certificate
    * @return comma separated string of key usage
    * @description
    * This method will get key usage extension value
    * as comma separated string of usage names.
    * If there is no key usage extension in the certificate,
    * it returns empty string (i.e. '').
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtKeyUsageString() → "digitalSignature,keyEncipherment"
    */
  def getExtKeyUsageString(): String = js.native
  /**
    * get subjectAltName value as array of string in the certificate
    * @return array of alt name array
    * @description
    * This method will get subject alt name extension value
    * as array of type and name.
    * If there is this in the certificate, it returns undefined;
    * Type of GeneralName will be shown as following:
    *
    * - "MAIL" - [1]rfc822Name
    * - "DNS"  - [2]dNSName
    * - "DN"   - [4]directoryName
    * - "URI"  - [6]uniformResourceIdentifier
    * - "IP"   - [7]iPAddress
    *
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtSubjectAltName2() →
    * [["DNS",  "example.com"],
    *  ["DNS",  "example.org"],
    *  ["MAIL", "foo@example.com"],
    *  ["IP",   "192.168.1.1"],
    *  ["DN",   "/C=US/O=TEST1"]]
    */
  def getExtSubjectAltName2(): js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * get subjectKeyIdentifier value as hexadecimal string in the certificate
    * @return hexadecimal string of subject key identifier or null
    * @description
    * This method will get subject key identifier extension value
    * as hexadecimal string.
    * If there is this in the certificate, it returns undefined;
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    * x.getExtSubjectKeyIdentifier() → "1b3347ab...";
    */
  def getExtSubjectKeyIdentifier(): String = js.native
  /**
    * get certificate information as string.
    * @return certificate information string
    * @example
    * x = new X509();
    * x.readCertPEM(certPEM);
    * console.log(x.getInfo());
    * // this shows as following
    * Basic Fields
    *   serial number: 02ac5c266a0b409b8f0b79f2ae462577
    *   signature algorithm: SHA1withRSA
    *   issuer: /C=US/O=DigiCert Inc/OU=www.digicert.com/CN=DigiCert High Assurance EV Root CA
    *   notBefore: 061110000000Z
    *   notAfter: 311110000000Z
    *   subject: /C=US/O=DigiCert Inc/OU=www.digicert.com/CN=DigiCert High Assurance EV Root CA
    *   subject public key info:
    *     key algorithm: RSA
    *     n=c6cce573e6fbd4bb...
    *     e=10001
    * X509v3 Extensions:
    *   keyUsage CRITICAL:
    *     digitalSignature,keyCertSign,cRLSign
    *   basicConstraints CRITICAL:
    *     cA=true
    *   subjectKeyIdentifier :
    *     b13ec36903f8bf4701d498261a0802ef63642bc3
    *   authorityKeyIdentifier :
    *     kid=b13ec36903f8bf4701d498261a0802ef63642bc3
    * signature algorithm: SHA1withRSA
    * signature: 1c1a0697dcd79c9f...
    */
  def getInfo(): String = js.native
  /**
    * get hexadecimal string of issuer field TLV of certificate.
    * @return hexadecial string of issuer DN ASN.1
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var issuer = x.getIssuerHex(); // return string like "3013..."
    */
  def getIssuerHex(): String = js.native
  /**
    * get string of issuer field of certificate.
    * @return issuer DN string
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var issuer = x.getIssuerString(); // return string like "/C=US/O=TEST"
    */
  def getIssuerString(): String = js.native
  /**
    * get notAfter field string of certificate.
    * @return not after time value (ex. "151231235959Z")
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var notAfter = x.getNotAfter(); // return string like "151231235959Z"
    */
  def getNotAfter(): String = js.native
  /**
    * get notBefore field string of certificate.
    * @return not before time value (ex. "151231235959Z")
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var notBefore = x.getNotBefore(); // return string like "151231235959Z"
    */
  def getNotBefore(): String = js.native
  /**
    * get a RSAKey/ECDSA/DSA public key object of subjectPublicKeyInfo field.
    * @return RSAKey/ECDSA/DSA public key object of subjectPublicKeyInfo field
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * pubkey = x.getPublicKey();
    */
  def getPublicKey(): RSAKey | DSA | ECDSA = js.native
  /**
    * get a string index of contents of subjectPublicKeyInfo BITSTRING value from hexadecimal certificate
    * @return string index of key contents
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * idx = x.getPublicKeyContentIdx(); // return string index in x.hex parameter
    */
  // NOTE: Without BITSTRING encapsulation.
  def getPublicKeyContentIdx(): Double = js.native
  /**
    * get a hexadecimal string of subjectPublicKeyInfo field.
    * @return ASN.1 SEQUENCE hexadecimal string of subjectPublicKeyInfo field
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * hSPKI = x.getPublicKeyHex(); // return string like "30820122..."
    */
  def getPublicKeyHex(): String = js.native
  /**
    * get a string index of subjectPublicKeyInfo field for hexadecimal string certificate.
    * @return string index of subjectPublicKeyInfo field for hexadecimal string certificate.
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM);
    * idx = x.getPublicKeyIdx(); // return string index in x.hex parameter
    */
  def getPublicKeyIdx(): Double = js.native
  /**
    * get hexadecimal string of serialNumber field of certificate.
    * @return hexadecimal string of certificate serial number
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var sn = x.getSerialNumberHex(); // return string like "01ad..."
    */
  def getSerialNumberHex(): String = js.native
  /**
    * get signature algorithm name in basic field
    * @return signature algorithm name (ex. SHA1withRSA, SHA256withECDSA)
    * @description
    * This method will get a name of signature algorithm field of certificate:
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * algName = x.getSignatureAlgorithmField();
    */
  def getSignatureAlgorithmField(): String = js.native
  /**
    * get signature algorithm name from hexadecimal certificate data
    * @param hCert hexadecimal string of X.509 certificate binary
    * @return signature algorithm name (ex. SHA1withRSA, SHA256withECDSA)
    * @description
    * This method will get signature algorithm name of certificate:
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * x.getSignatureAlgorithmName() → "SHA256withRSA"
    */
  def getSignatureAlgorithmName(): String = js.native
  /**
    * get signature value in hexadecimal string
    * @return signature value hexadecimal string without BitString unused bits
    * @description
    * This method will get signature value of certificate:
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * x.getSignatureValueHex() → "8a4c47913..."
    */
  def getSignatureValueHex(): String = js.native
  /**
    * get hexadecimal string of subject field of certificate.
    * @return hexadecial string of subject DN ASN.1
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var subject = x.getSubjectHex(); // return string like "3013..."
    */
  def getSubjectHex(): String = js.native
  /**
    * get string of subject field of certificate.
    * @return subject DN string
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * var subject = x.getSubjectString(); // return string like "/C=US/O=TEST"
    */
  def getSubjectString(): String = js.native
  /**
    * get format version (X.509v1 or v3 certificate)
    * @return 1 for X509v1, 3 for X509v3, otherwise 0
    * @description
    * This method returns a format version of X.509 certificate.
    * It returns 1 for X.509v1 certificate and 3 for v3 certificate.
    * Otherwise returns 0.
    * This method will be automatically called in
    * `X509#readCertPEM`. After then, you can use
    * `X509.version` parameter.
    * @example
    * var x = new X509();
    * x.readCertPEM(sCertPEM);
    * version = x.getVersion();    // 1 or 3
    * sn = x.getSerialNumberHex(); // return string like "01ad..."
    */
  def getVersion(): Double = js.native
  /**
    * set array of X.509v3 extesion information such as extension OID, criticality and value index.
    * @description
    * This method will set an array of X.509v3 extension information having
    * following parameters:
    *
    * - oid - extension OID (ex. 2.5.29.19)
    * - critical - true or false
    * - vidx - string index for extension value
    *
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // parseExt() will also be called internally.
    *
    * x.aExtInfo →
    * [ { oid: "2.5.29,19", critical: true, vidx: 2504 }, ... ]
    */
  def parseExt(params: Anon_CriticalOid): Unit = js.native
  /**
    * read a hexadecimal string of X.509 certificate
    * @param sCertHex hexadecimal string of X.509 certificate
    * @description
    * NOTE: `X509#parseExt` will be called internally since jsrsasign 7.2.0.
    * @example
    * x = new X509();
    * x.readCertHex("3082..."); // read certificate
    */
  def readCertHex(sCertHex: String): Unit = js.native
  /**
    * read PEM formatted X.509 certificate from string.
    * @param sCertPEM string for PEM formatted X.509 certificate
    * @example
    * x = new X509();
    * x.readCertPEM(sCertPEM); // read certificate
    */
  def readCertPEM(sCertPEM: String): Unit = js.native
  def verifySignature(pubKey: DSA): Boolean = js.native
  def verifySignature(pubKey: ECDSA): Boolean = js.native
  /**
    * verifies signature value by public key
    * @param pubKey public key object
    * @return true if signature value is valid otherwise false
    * @description
    * This method verifies signature value of hexadecimal string of
    * X.509 certificate by specified public key object.
    * @example
    * pubKey = KEYUTIL.getKey(pemPublicKey); // or certificate
    * x = new X509();
    * x.readCertPEM(pemCert);
    * x.verifySignature(pubKey) → true, false or raising exception
    */
  def verifySignature(pubKey: RSAKey): Boolean = js.native
}

/* static members */
@JSGlobal("jsrsasign.X509")
@js.native
object X509 extends js.Object {
  val version: String = js.native
  /**
    * get RSA/DSA/ECDSA public key object from X.509 certificate hexadecimal string
    * @param h hexadecimal string of X.509 certificate for RSA/ECDSA/DSA public key
    * @return returns RSAKey/KJUR.crypto.{ECDSA,DSA} object of public key
    */
  def getPublicKeyFromCertHex(h: String): RSAKey | DSA | ECDSA = js.native
  /**
    * get RSA/DSA/ECDSA public key object from PEM certificate string
    * @param sCertPEM PEM formatted RSA/ECDSA/DSA X.509 certificate
    * @return returns RSAKey/KJUR.crypto.{ECDSA,DSA} object of public key
    * @description
    * NOTE: DSA is also supported since x509 1.1.2.
    */
  def getPublicKeyFromCertPEM(sCertPEM: String): RSAKey | DSA | ECDSA = js.native
  /**
    * get public key information from PEM certificate
    * @param sCertPEM string of PEM formatted certificate
    * @return hash of information for public key
    * @description
    * Resulted associative array has following properties:
    *
    * - algoid - hexadecimal string of OID of asymmetric key algorithm
    * - algparam - hexadecimal string of OID of ECC curve name or null
    * - keyhex - hexadecimal string of key in the certificate
    *
    * NOTE: X509v1 certificate is also supported since x509.js 1.1.9.
    */
  def getPublicKeyInfoPropOfCertPEM(sCertPEM: String): String = js.native
  /**
    * get string from hexadecimal string of ASN.1 DER AttributeTypeAndValue
    * @param hex hexadecimal string of ASN.1 DER concludes AttributeTypeAndValue
    * @param idx index of hexadecimal string (DEFAULT=0)
    * @return string representation of AttributeTypeAndValue (ex. C=US)
    * @description
    * This static method converts from a hexadecimal string of AttributeTypeAndValue
    * specified by 'hex' and 'idx' to LDAP string representation (ex. C=US).
    * @example
    * X509.hex2attrTypeValue("3008060355040a0c0161") → O=a
    * X509.hex2attrTypeValue("300806035504060c0161") → C=a
    * X509.hex2attrTypeValue("...3008060355040a0c0161...", 128) → O=a
    */
  def hex2attrTypeValue(hex: String, idx: Double): String = js.native
  /**
    * get distinguished name string in OpenSSL online format from hexadecimal string of ASN.1 DER X.500 name
    * @param hex hexadecimal string of ASN.1 DER distinguished name
    * @param idx index of hexadecimal string (DEFAULT=0)
    * @return OpenSSL online format distinguished name
    * @description
    * This static method converts from a hexadecimal string of
    * distinguished name (DN)
    * specified by 'hex' and 'idx' to OpenSSL oneline string representation (ex. /C=US/O=a).
    * @example
    * X509.hex2dn("3031310b3...") → /C=US/O=a/CN=b2+OU=b1
    */
  def hex2dn(hex: String, idx: Double): String = js.native
  /**
    * get relative distinguished name string in OpenSSL online format from hexadecimal string of ASN.1 DER RDN
    * @param hex hexadecimal string of ASN.1 DER concludes relative distinguished name
    * @param idx index of hexadecimal string (DEFAULT=0)
    * @return OpenSSL online format relative distinguished name
    * @description
    * This static method converts from a hexadecimal string of
    * relative distinguished name (RDN)
    * specified by 'hex' and 'idx' to LDAP string representation (ex. O=test+CN=test).
    * NOTE: Multi-valued RDN is supported since jsnrsasign 6.2.2 x509 1.1.10.
    * @example
    * X509.hex2rdn("310a3008060355040a0c0161") → O=a
    * X509.hex2rdn("31143008060355040a0c01613008060355040a0c0162") → O=a+O=b
    */
  def hex2rdn(hex: String, idx: Double): String = js.native
}

