/*
 * Copyright 2009, Strategic Gains, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strategicgains.restx.serialization;

import org.jboss.netty.buffer.ChannelBuffer;



/**
 * @author toddf
 * @since Nov 20, 2009
 */
public interface Deserializer
{
	public <T> T deserialize(String string, Class<T> type);
	public <T> T deserialize(ChannelBuffer buffer, Class<T> type);
}
