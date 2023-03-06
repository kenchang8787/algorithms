
var sol = new Solution();

// 1, false
Console.WriteLine(sol.IsMatch("aa", "a"));
// 2, true
Console.WriteLine(sol.IsMatch("aa", "a*"));
// 3, true
Console.WriteLine(sol.IsMatch("ab", ".*"));
// 4, false
Console.WriteLine(sol.IsMatch("ab", ".*c"));
// 5, true
Console.WriteLine(sol.IsMatch("aaa", "a*a"));
// 6, false
Console.WriteLine(sol.IsMatch("aaba", "ab*a*c*a"));
// 7, true
Console.WriteLine(sol.IsMatch("bbbba", ".*a*a"));
