# YAL
Yet another language 

## Description

Starts with `Kotlin`'s grammar as base, and adds features from `Python`, `C#` and `Java`'s grammars.
This is just the `front-end` of a three-phase compiler for now.

### Checklist

##### Done
- removed `var`, `val` & `fun` keywords
- added pow `**` and xor `^` operators + assignment versions
- added standard `for` loop (on steroids)
- added short-circuiting bool operators (`&` and `|`)
- added assignment versions for all bitwise operators
- added multi catch + `try`/`catch`/`finally` 1-liner versions
- added list comprehensions
- added list splicing (using `#` instead of `:` because can conflict with `::` reference operator)
- added null-coalescing/elvis assignment operator `?:=`
- added multiple variable arity function parameters (Note: have to be separated by `;` if more than one in a single function declaration)
- changed multi-line string to use `m"` start operator (e.g. `m"I can span many lines"`)
- added unescaped strings using `@"` start operator (e.g. `@"C:\path\to\file.txt"` [backslashes don't need to be escaped + supports string interpolation])
- added brace expansions using `b"` start operator (e.g. `b"{a, b{001..003}}"` will generate the string `"a b001 b002 b003"`)
- added complex numbers support (standard/pure `1+2I`|`2I`, polar `a e** b` or cis `a cis b` forms)





















































##### To-Do

- AST
- Semantic analyzer
- Source-to-source compiler? (to `Kotlin` probably since it can run using `JVM`, `JS` or native)
