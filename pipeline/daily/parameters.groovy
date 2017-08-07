pipelineParameters += [
  string(name: 'GITHUB_BOT_NAME',
         defaultValue: constants.GITHUB_BOT_NAME,
         description:
         'Name of the GitHub user to create commits automatically.'),
  string(name: 'GITHUB_BOT_USER_NAME',
         defaultValue: constants.GITHUB_BOT_USER_NAME,
         description:
         'User name of the GitHub user to create commits automatically.'),
  string(name: 'GITHUB_BOT_EMAIL',
         defaultValue: constants.GITHUB_BOT_EMAIL,
         description:
         'Email of the GitHub user to create commits automatically.'),

  string(name: 'UPLOAD_SERVER_PERIODIC_BUILDS_DIR_PATH',
         defaultValue: constants.UPLOAD_SERVER_NIGHTLY_DIR_PATH,
         description:
         'Directory in the target server to upload periodic builds results.'),

  string(name: 'SLACK_NOTIFICATION_RECIPIENT',
	 defaultValue: constants.SLACK_NOTIFICATION_RECIPIENT,
         description:
         'Where notifications will be sent to. E.g: #channel or @user'),
  string(name: 'SLACK_TEAM_DOMAIN',
         defaultValue: constants.SLACK_TEAM_DOMAIN,
         description:
         'Domain that contains the Slack channel or user which will ' +
	 'receive the notifications.'),
  password(name: 'SLACK_TOKEN',
	   defaultValue: constants.SLACK_TOKEN,
	   description:
	   'Access token from the Jenkins integration app in Slack. ' +
	   'More info at: https://my.slack.com/services/new/jenkins-ci'),
]

return pipelineParameters