/*
 * Copyright 2019-2022 NXP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nxp.sems.channel;

public class SemsRawApduChannel implements ISemsApduChannel {

  @Override
  public byte[] open(byte[] aid) {
    // TODO Auto-generated method stub
    return new byte[2];
  }

  @Override
  public byte[] transmit(byte[] buffer) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void close() {
    // TODO Auto-generated method stub
    return;
  }

  @Override
  public boolean isAuthRequired() {
    // TODO Auto-generated method stub
    return true;
  }
}
