#include <jni.h>

#ifndef __Native__
#define __Native__

#ifdef __cplusplus
extern "C"
{
#endif

JNIEXPORT void JNICALL Java_Native_beginCountdown (JNIEnv *env, jobject);

#ifdef __cplusplus
}
#endif

#endif