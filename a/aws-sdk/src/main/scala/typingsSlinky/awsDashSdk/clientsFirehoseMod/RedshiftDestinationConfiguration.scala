package typingsSlinky.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDestinationConfiguration extends js.Object {
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsSlinky.awsDashSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.native
  /**
    * The database connection string.
    */
  var ClusterJDBCURL: typingsSlinky.awsDashSdk.clientsFirehoseMod.ClusterJDBCURL = js.native
  /**
    * The COPY command.
    */
  var CopyCommand: typingsSlinky.awsDashSdk.clientsFirehoseMod.CopyCommand = js.native
  /**
    * The user password.
    */
  var Password: typingsSlinky.awsDashSdk.clientsFirehoseMod.Password = js.native
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typingsSlinky.awsDashSdk.clientsFirehoseMod.ProcessingConfiguration] = js.native
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon Redshift. Default value is 3600 (60 minutes).
    */
  var RetryOptions: js.UndefOr[RedshiftRetryOptions] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: typingsSlinky.awsDashSdk.clientsFirehoseMod.RoleARN = js.native
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.native
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[RedshiftS3BackupMode] = js.native
  /**
    * The configuration for the intermediate Amazon S3 location from which Amazon Redshift obtains data. Restrictions are described in the topic for CreateDeliveryStream. The compression formats SNAPPY or ZIP cannot be specified in RedshiftDestinationConfiguration.S3Configuration because the Amazon Redshift COPY operation that reads from the S3 bucket doesn't support these compression formats.
    */
  var S3Configuration: S3DestinationConfiguration = js.native
  /**
    * The name of the user.
    */
  var Username: typingsSlinky.awsDashSdk.clientsFirehoseMod.Username = js.native
}

object RedshiftDestinationConfiguration {
  @scala.inline
  def apply(
    ClusterJDBCURL: ClusterJDBCURL,
    CopyCommand: CopyCommand,
    Password: Password,
    RoleARN: RoleARN,
    S3Configuration: S3DestinationConfiguration,
    Username: Username,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RetryOptions: RedshiftRetryOptions = null,
    S3BackupConfiguration: S3DestinationConfiguration = null,
    S3BackupMode: RedshiftS3BackupMode = null
  ): RedshiftDestinationConfiguration = {
    val __obj = js.Dynamic.literal(ClusterJDBCURL = ClusterJDBCURL.asInstanceOf[js.Any], CopyCommand = CopyCommand.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions.asInstanceOf[js.Any])
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration.asInstanceOf[js.Any])
    if (RetryOptions != null) __obj.updateDynamic("RetryOptions")(RetryOptions.asInstanceOf[js.Any])
    if (S3BackupConfiguration != null) __obj.updateDynamic("S3BackupConfiguration")(S3BackupConfiguration.asInstanceOf[js.Any])
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationConfiguration]
  }
}

