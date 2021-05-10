//1
a = "(dadada())dadasds(sds)()"

console.log(a)
let counter = 0;
for (i = 0; i < a.length; i++) {

    if (a[i] === '(') {
        counter++;
    } else if (a[i] === ')') {
        counter--;
    }
}
if (counter === 0) {
    console.log("parenthesis are ok")
} else {
    console.log("parenthesis are not ok")
}

//2
var isValid = function (s) {
    let stack = [];
    for (i = 0; i < s.length; i++) {
        if (s[i] === "{" || s[i] === "[" || s[i] === "(") {
            stack.push(s[i]);
        }
        else if (s[i] === "}" || s[i] === "]" || s[i] === ")") {
            const top = stack.pop();
            if ((top === "{" && s[i] === "}") || (top === "[" && s[i] === "]") || (top === "(" && s[i] === ")")) {
            } else {
                return false;
            }
        }
    }
    if (stack.length > 0) {
        return false;
    }
    return true;
};
const s = "{[]}{}[]()([{}]){[][]}]"
console.log(isValid("()"));
console.log(isValid("()[]{}"));
console.log(isValid("(]"));
console.log(isValid("([])]"));
console.log(isValid("{[]}"));
console.log(isValid("({{{{}}}))"));
console.log(isValid(s));
