// Copyright 2016 Twitter. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.twitter.heron.api.hooks.info;

public class SpoutFailInfo {
  private Object messageId;
  private int spoutTaskId;
  private Long failLatencyMs; // null if it wasn't sampled

  public SpoutFailInfo(Object messageId, int spoutTaskId, Long failLatencyMs) {
    this.messageId = messageId;
    this.spoutTaskId = spoutTaskId;
    this.failLatencyMs = failLatencyMs;
  }

  public Object getMessageId() {
    return messageId;
  }

  public int getSpoutTaskId() {
    return spoutTaskId;
  }

  public Long getFailLatencyMs() {
    return failLatencyMs;
  }
}
