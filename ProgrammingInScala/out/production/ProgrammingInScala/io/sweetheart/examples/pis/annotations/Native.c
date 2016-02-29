#include "Native.h"

JNIEXPORT void JNICALL Java_Native_beginCountdown (JNIEnv *env, jobject obj)
{
    int i;
    for (i = 3; i > 0; i--)
    {
        printf("%d...\n", i);
        sleep(1);
    }
    printf("BOOM!!\n");
}