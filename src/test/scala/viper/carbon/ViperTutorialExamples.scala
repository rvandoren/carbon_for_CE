/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package viper.silicon.tests

import org.scalatest.DoNotDiscover
import viper.carbon.AllTests

@DoNotDiscover
class ViperTutorialExamples extends AllTests {
  override val testDirectories = Seq("viper_tutorial_examples")
}
