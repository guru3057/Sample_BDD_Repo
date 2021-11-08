Feature: OrangeHRM search system user

  Background:
    When Admin login into Orange HRM
      | username | Password |
      | Admin    | admin123 |

  Scenario: User navigates to Admin Tab and search for System user
    Then Admin navigates to Orange HRM homepage and verifies logo
    And Admin navigates to Admin tab
    And Admin search for system users
      | systemUsername | Employee Name |
      | Admin          | Paul Collings |
