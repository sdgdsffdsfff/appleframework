/**
 * Copyright (C) 2010-2012 LShift Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appleframework.distributed.id.snowflake;

public class SequenceExhaustedException extends Exception {
	private static final long serialVersionUID = -2301105407104624814L;

	public SequenceExhaustedException(int seqNum) {
		super(String.format("Sequence upper bound reached at %d", seqNum));
	}
}
