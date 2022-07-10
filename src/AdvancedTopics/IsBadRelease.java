package AdvancedTopics;

// Your product manager has just informed you that a bug you created was released in one of the past versions
// and has caused all versions that have been released since to also be bad. Given that your past releases
// are numbered from zero to N and you have a helper function isBadRelease(int releaseNumber) that takes a
// version number and returns a boolean as to whether or not the given release number is bad, return the release
// number that your bug was initially shipped in.
public class IsBadRelease {

    // Runtime: O(logN). This results from discarding half of our search space each time we call isBadRelease().
    // Space complexity: O(1) or constant since our memory usage does not scale as N does.
    public static int badReleases(int N) {
        int left = 0;
        int right = N;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(isBadRelease(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // dummy method
    private static boolean isBadRelease(int mid) {
        return false;
    }
}
