/*
 * Copyright 2012-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.task;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Callback interface that can be used to customize a {@link ThreadPoolTaskExecutor}.
 *
 * @author Stephane Nicoll
 * @since 2.1.0
 * @see TaskExecutorBuilder
 * @deprecated since 3.2.0 for removal in 3.4.0 in favor of
 * {@link ThreadPoolTaskExecutorCustomizer}
 */
@FunctionalInterface
@Deprecated(since = "3.2.0", forRemoval = true)
public interface TaskExecutorCustomizer {

	/**
	 * Callback to customize a {@link ThreadPoolTaskExecutor} instance.
	 * @param taskExecutor the task executor to customize
	 */
	void customize(ThreadPoolTaskExecutor taskExecutor);

}
